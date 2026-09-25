package org.example;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numer;
        int total = 0;

        System.out.println("Podaj liczbe rzutów");
        numer = sc.nextInt();

        if(numer > 0){
            for(int i = 0; i < numer; i++){
                int kostka = rand.nextInt(1,7);
                wypis(kostka);
                total += kostka;
                System.out.println("Wyrzuciłeś: " + kostka);
            }
            System.out.println("Total:" + total);

        }else{
            System.out.println("ilość musi być różna i większa od zera");
        }


    }
    static void wypis(int kostka){
    String opcj1 = """
              -------
             |      |
             |   *  |
             |      |
              -------
            """;
    String opcj2 = """
              -------
             | *    |
             |      |
             |    * |
              -------
            """;
    String opcj3 = """
              -------
             | *    |
             |   *  |
             |    * |
              -------
            """;
    String opcj4 = """
              -------
             | *  * |
             |      |
             | *  * |
              -------
            """;
    String opcj5 = """
              -------
             | *  * | 
             |   *  |
             | *  * |
              -------
            """;
    String opcj6 = """
              -------
             | * * *|
             |      |
             | * * *|
              -------
            """;

        switch (kostka){
            case 1 -> System.out.println(opcj1);
            case 2 -> System.out.println(opcj2);
            case 3 -> System.out.println(opcj3);
            case 4 -> System.out.println(opcj4);
            case 5 -> System.out.println(opcj5);
            case 6 -> System.out.println(opcj6);
        }
    }
}
