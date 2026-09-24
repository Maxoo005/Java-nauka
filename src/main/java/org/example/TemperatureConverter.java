package org.example;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double noweTemp;
        String jednostka;

        System.out.print("podaj temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Wybierz jednostke na którą chcesz zmienić celcjusz czy farenhait (C lub F): ");
        jednostka = scanner.next().toUpperCase();

        noweTemp = (jednostka.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9 ) + 32;

        System.out.printf("%.1f stopni %s", noweTemp, jednostka);


        scanner.close();
    }
}
