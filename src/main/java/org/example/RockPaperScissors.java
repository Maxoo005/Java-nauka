package org.example;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int licznikU = 0;
        int licznikK = 0;

        System.out.println("Witam w grze :D");
        System.out.println("Do ilu zwycięstw chcesz grać?");
        int ile = sc.nextInt();
        sc.nextLine();

        String[] opcje = {"PAPIER", "KAMIEN", "NOZYCE"};
        System.out.println("Grasz w papier kamień nożyce z komputerem do " + ile + " zwycięstw");

        while (licznikU < ile && licznikK < ile) {
            System.out.print("Wybierz papier/kamien/nozyce: ");
            String wybor = sc.nextLine().trim().toUpperCase();

            if (!wybor.equals("PAPIER") && !wybor.equals("KAMIEN") && !wybor.equals("NOZYCE")) {
                System.out.println("Nie ma takiej opcji, spróbuj jeszcze raz");
                continue;
            }

            String komputer = opcje[rand.nextInt(3)];
            System.out.println("Komputer wybrał: " + komputer);

            if (wybor.equals(komputer)) {
                System.out.println("Remis");
            } else if ((wybor.equals("PAPIER") && komputer.equals("KAMIEN")) ||
                    (wybor.equals("KAMIEN") && komputer.equals("NOZYCE")) ||
                    (wybor.equals("NOZYCE") && komputer.equals("PAPIER"))) {
                System.out.println("Wygrywasz!!");
                licznikU++;
            } else {
                System.out.println("Wygrywa komputer");
                licznikK++;
            }

            System.out.println("Wynik: Ty " + licznikU + " : " + licznikK + " Komputer");
        }

        if (licznikU == ile) {
            System.out.println("Gratulacje, wygrałeś!");
        } else {
            System.out.println("Komputer wygrał, spróbuj jeszcze raz :(");
        }
    }
}