package br.com.geekuniversity.section06;

import java.util.Scanner;

public class S06e02 {
    public static void main(String[] args) {
        float number, a , b;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        number = userInput.nextFloat();
        
        if (number > 0) {
            a = number;
            System.out.printf("\nThe number %.2f is positive.\n", a);
        } else if (number < 0) {
            b = number;
        System.out.printf("\nThe number %.2f is negative", b);
        } else {
            System.out.printf("You entered the number %.0f.", number);
        }
        
        userInput.close();

    }
}