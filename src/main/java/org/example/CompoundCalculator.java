package org.example;
import java.util.Scanner;

public class CompoundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        int years;
        int timesCompounded;
        double rate;
        double amount;
        double inwestycja;
        String nazwa;

        System.out.println("Welcome to the compound calculator");
        System.out.println("Podaj ile masz na koncie");
        principal = scanner.nextDouble();
        System.out.println("Jaki procent cie interesuje");
        rate = scanner.nextDouble() / 100;
        System.out.println("na ile lat chciałbyś ulokować pieniądze");
        years = scanner.nextInt();
        System.out.println("ile kumulacji rocznie? ");
        timesCompounded = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        inwestycja = amount - principal;

        if (inwestycja > 0)
            nazwa = "Inwestycja udana";
        else if (inwestycja < 0)
            nazwa = "Inwestycja nie udana";
        else
            nazwa = "Jesteś na zero ciołku";

        System.out.printf("Wartość jaką wrzucisz to %.2f, po %d lat i przy %.2f procent będziesz miał %.2f na koncie. Ostatecznie inwestycja przyniesie %.2f. Podsumowując %s", principal, years, rate, amount, inwestycja, nazwa);
    }
}
