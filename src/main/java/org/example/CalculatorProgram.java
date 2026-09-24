package org.example;
import  java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double liczb1;
        double liczb2;
        double wynik = 0;
        char operator;
        boolean validOperation = true;

        System.out.println("Podaj pierwszą liczbe: ");
        liczb1 = scanner.nextDouble();

        System.out.println("Podaj drugą liczbe: ");
        liczb2 = scanner.nextDouble();

        System.out.println("Podaj operator (+, -, *, /, ^ ) :");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' -> wynik = liczb1 + liczb2;
            case '-' -> wynik = liczb1 - liczb2;
            case '*' -> wynik = liczb1 * liczb2;
            case '/' ->{
                if (liczb2 == 0){
                    System.out.println("Nie można dzielić przez 0 ");
                    validOperation = false;
                }else{
                    wynik = liczb1 / liczb2;
                }
            }
            case '^' -> wynik = Math.pow(liczb1, liczb2);
            default  -> {
                System.out.println("Wybierz poprawny operator :), operator " + operator + "jest nie poprawny");
                validOperation = false;
            }
        }
        if (validOperation) {
            System.out.println("Wynik: " + wynik);
        }else{
            System.out.println("Coś poszło nie tak :(");
        }


        scanner.close();
    }
}


