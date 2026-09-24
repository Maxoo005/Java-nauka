package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double waga;
        double nowaWaga;
        int wybor;

        System.out.println("Program zmieniający jednostki wag ");
        System.out.println("1: zamiana lbs na kg ");
        System.out.println("2: zamiana kg na lbs ");
        System.out.print("Wybierz którą opcje:");
        wybor = scanner.nextInt();

        if (wybor == 1) {
            System.out.println("Podaj wage lbs:");
            waga = scanner.nextDouble();
            nowaWaga = waga * 0.453592;
            System.out.printf("Twoja nowa waga to: %.2f kg\n ", nowaWaga);
        }
        else if (wybor == 2) {
            System.out.println("Podaj wage kg:");
            waga = scanner.nextDouble();
            nowaWaga = waga * 2.20462;
            System.out.printf("Twoja nowa waga to: %.2f lbs\n", nowaWaga);
        }
        else{
            System.out.println("To nie jest poprawna wartość wybierz 1 lub 2");
        }



        scanner.close();
    }
}
