package org.example;
import java.util.Scanner;


public class MadLibsGame {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favourite food");
        String word1  = scanner.nextLine();
        System.out.print("Enter your favourite sport");
        String word2 = scanner.nextLine();
        System.out.print("Enter what you would like to tell me: ");
        String word3 = scanner.nextLine();
        System.out.print("Enter how much money do you have on your account");
        double money =scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age:");
        int years = scanner.nextInt();

        System.out.println("Hi " + name);
        System.out.println("I am " + years + " old");
        System.out.println("My favourite food is " + word1);
        System.out.println("My favourite sport is " + word2);
        System.out.println("Right now I have " + money + " on my bank account");
        System.out.println("I would like to tell you that: " + word3);

        scanner.close();
    }


}
