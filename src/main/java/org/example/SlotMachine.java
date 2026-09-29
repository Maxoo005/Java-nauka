package org.example;
import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

    static double balans = 100;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static boolean isReady = true;

    static void main(String args[]) {
        System.out.println("*****************");
        System.out.println("Witam na slotach ");
        System.out.println("Symbole: \uD83C\uDFB0 \uD83D\uDD14 \uD83C\uDF49 \uD83C\uDF52 \uD83D\uDCB0 ");
        System.out.println("*****************");

        while(isReady){
            System.out.println("Witaj w kasynku: ");
            System.out.println("Popraw numer opcji która Cię interesuje ");
            System.out.println("1. Pokaż balans");
            System.out.println("2. Doładuj konto");
            System.out.println("3. Zakręć se");
            System.out.println("4. Wypłata");
            System.out.println("5. Wyjśćie");
            int wybor = scanner.nextInt();

            switch (wybor){
                case 1 -> pokazBalans();
                case 2 -> dodajBalans();
                case 3 -> maszyna();
                case 4 -> wyplacBalans();
                case 5 -> exit();
                default-> {
                    System.out.println("***************************************************");
                    System.out.println("Nie można wykonać polecenia wybierz poprawną opcje ");
                    System.out.println("***************************************************");
                }
            }
        }

        scanner.close();
    }
    static void pokazBalans(){
        System.out.println("*****************************");
        System.out.printf("Twój balans wynosi %.2f \n", balans );
        System.out.println("*****************************");
    }
    static void dodajBalans(){
        System.out.println("*****************************");
        System.out.println("Podaj kwote wpłaty: ");
        double dodaj = scanner.nextDouble();
        balans = balans + dodaj;
        System.out.printf("Dodano do balansu %.2f: \n", dodaj);
        System.out.println("*****************************");
    }
    static void wyplacBalans(){
        System.out.println("*****************************");
        System.out.println("Podaj kwote wypłaty");
        double wyplac = scanner.nextDouble();
        if (wyplac > balans){
            System.out.println("Podaj poprawną kwote wypłaty");
        }else if (wyplac < 0){
            System.out.println("Nie możesz wypłacić liczby na minusie");
        }else{
            balans -= wyplac;
            System.out.printf("Wypłacono: %.2f \n", wyplac);
        }
        System.out.println("*****************************");
    }
    static boolean exit(){
        System.out.println("*****************************");
        System.out.println("Dziękujemy za udział ");
        System.out.println("*****************************");
        return isReady = false;
    }
    static void maszyna(){
        System.out.println("*****************************");
        System.out.println("Podaj za ile wchodzisz: ");
        double bet = scanner.nextDouble();

        if (bet > balans){
            System.out.println("******************************");
            System.out.println("Nie masz wystarczająco środków");
            System.out.println("******************************");
            return;
        }else if (bet < 0){
            System.out.println("Nie można grać na kredyt");
            return;
        }else{
            balans -= bet;
        }

        String [] symbole = {"🎰", "🔔", "🍉", "🍒", "💰"};
        String[] wynik = new String[3];

        for (int i=0; i<3; i++){
            int wylosowanyIdx = random.nextInt(symbole.length);
            wynik[i] = symbole[wylosowanyIdx];
            System.out.print(symbole[wylosowanyIdx] + "   ");
        }

        System.out.println();

        if(wynik[0].equals(wynik[1]) && wynik[1].equals(wynik[2])){
            double win = 0;
            switch(wynik[0]){
                case "🎰" -> {
                    win = bet*50;
                    System.out.println("******");
                    System.out.println("JACPOT");
                    System.out.println("******");
                }
                case "🔔" -> win = bet*20;
                case "🍉" -> win = bet*10;
                case "🍒" -> win = bet*5;
                case "💰" -> win = bet*3;
            }
            balans = balans + win;
            System.out.println("******************************");
            System.out.printf("Wygrywasz %.2f", win);
            System.out.println("******************************");
        } else if(wynik[0].equals(wynik[1]) || wynik[0].equals(wynik[2]) || wynik[1].equals(wynik[2])){
            balans += bet;
            System.out.println("********************************************");
            System.out.println("Trafiłeś dwie takie same, wychodzisz na zero");
            System.out.println("********************************************");
        }else{
            System.out.println("*************************");
            System.out.println("Brak wygranej, PRZEGRAŁEŚ");
            System.out.println("*************************");
        }

        System.out.printf("Twój obecny balans: %.2f \n", balans);
        System.out.println("*****************************");

    }
}
