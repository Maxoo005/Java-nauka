package org.example;
import java.util.Scanner;

public class QuizGame {
    static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        String [] pytania = {"Pytanie 1:",
                "Pytanie 2:",
                "Pytanie 3:",
                "Pytanie 4:",
                "Pytanie 5:"};

        String [][] odpowiedzi = {{"1. zle","2. dobrze","3. zle","4. zle"},
                {"1. dobrze","2. zle","3. zle","4. zle"},
                {"1. zle","2. zle","3. dobrze","4. zle"},
                {"1. zle","2. zle","3. zle","4. dobrze"},
                {"1. dobrze","2. zle","3. zle","4. zle"}};

        String [] poprawneodp = {"2", "1", "3", "4", "1"};

        boolean graj = true;
        String odpU;

        do {
            int licznik =0;

            System.out.println("**************************");
            System.out.println("Witam w mojej quiz grze :)");
            System.out.println("**************************");

            for (int i = 0; i < pytania.length; i++) {
                System.out.println(pytania[i]);
                for (String odp : odpowiedzi[i]) {
                    System.out.println(odp);
                }

                System.out.print("wytypuj swoją odpowiedz (podaj numer odpowiedzi): ");
                odpU = sc.nextLine();

                if (odpU.equals(poprawneodp[i])) {
                    licznik++;
                    System.out.println("Poprawna odpowiedź :)");
                } else {
                    System.out.println("Odpowiedź " + odpU + ". Jest niestety nie poprawna *sadge");
                }
            }
            System.out.println("Liczba poprawnych odpowiedzi  :" + licznik + " / " + pytania.length);
            System.out.println("Gratulacje, czy chcesz zagrać jeszcze raz?");
            System.out.println("Jeśli chcesz zagrać wybierz 1, jeśli chcesz opuścić wybierz 2 ");
            int wybor =sc.nextInt();
            if (wybor == 2) {
                graj = false;
            }else if(wybor >2 || wybor <1) {
                System.out.println("Podałeś złą wartość to oznacza koniec gry");
                graj = false;
            }
        }while(graj);
    }
}
