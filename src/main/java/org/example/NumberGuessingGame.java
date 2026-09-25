package org.example;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int wybor;
        int proba = 0;
        int min;
        int max;
        System.out.println("Podaj zakres od do ktorej liczby chcesz zgadywać: ");
        min = scanner.nextInt();
        max = scanner.nextInt();

        int losowyNumer = random.nextInt(min,max+ 1);

        System.out.printf("Gra, w której wybierasz losową wartość między %d-%d \n", min,max);
        do{
            System.out.print("Podaj swój numer: ");
            wybor = scanner.nextInt();
            proba++;
            if(wybor<min || wybor>max){
                System.out.println(" Liczba poza zakresem");
            }else if(wybor>losowyNumer){
                System.out.println(" Za duża");
            }else if (wybor<losowyNumer){
                System.out.println(" Za mała");
            }

        }while(wybor != losowyNumer);

        System.out.println("udało ci się zgadnąć liczbe: " + wybor + " w " + proba + " próbach ");

        scanner.close();
    }
}
