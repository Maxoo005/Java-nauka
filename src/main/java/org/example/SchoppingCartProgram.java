package org.example;
import java.util.Scanner;

public class SchoppingCartProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double total;

            System.out.println("Witaj w sklepie co chcesz kupić?");

            String name =scanner.nextLine();
            System.out.println("Ile trzeba zapłacić za " + name);

            double price =scanner.nextDouble();
            System.out.println("To jest koszt " + price);

            System.out.println("Dobrze a ile sztuk?");

            double items = scanner.nextDouble();
            System.out.println("Poprosze " + items + " sztuk");

            total = price * items;
            String result = String.format("%.2f", total);
            /*
            potencjalnie można zaokrąglić

            double rounted = Math.round(total * 100.0) \ 100.0;

             */

            System.out.println("To razem będzie " + total + ( "zł"));

        }
}
