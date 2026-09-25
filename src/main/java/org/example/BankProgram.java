package org.example;
import java.util.Scanner;

public class BankProgram {

    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double balans = 0;
        boolean isExit = false;

        while(!isExit) {
            System.out.println("***************************");
            System.out.println("Witaj w banku wybierz opcje");
            System.out.println("***************************");
            System.out.println("1. Pokaż balans konta\n 2. Wpłać środki\n 3. Wypłać środki\n 4. Wyjście");
            System.out.println("***************************");
            System.out.print("Wybieram: ");
            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1 -> pokazbalans(balans);
                case 2 -> balans += wpłatapieniędzy();
                case 3 -> balans -= wypłatapieniędzy(balans);
                case 4 -> isExit = true;
                default -> System.out.println("Zły wybór");

            }
        }
        System.out.println("**********************************");
        System.out.println("Dziękujemy za skorzystanie z banku");
        System.out.println("**********************************");

        scanner.close();

    }
    static void pokazbalans(double balans){
        System.out.printf("Twój balans: %.2f zł\n", balans);
    }

    static double wpłatapieniędzy(){
        Scanner scanner = new Scanner(System.in);
        double kwota;
        System.out.print("Ile chcesz wpłacić");
        kwota = scanner.nextDouble();
        if (kwota <0 ){
            System.out.println("nie możesz wpłacić pięniędzy na minusie");
            return 0;
        }else{

            return kwota;
        }
    }

    static double wypłatapieniędzy(double balans){
        Scanner scanner = new Scanner(System.in);
        double kwota;
        System.out.print("Ile chcesz wypłacić");
        kwota = scanner.nextDouble();
        if (kwota > balans ){
            System.out.println("nie możesz wypłacić więcej niż masz");
            return 0;
        }else if (kwota <0 ){
            System.out.println("Nie możesz wypłacić pieniędzy na minusie");
            return 0;
        }else{
            return kwota;
        }
    }
}
