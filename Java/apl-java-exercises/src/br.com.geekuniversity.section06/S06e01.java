package br.com.geekuniversity.section06;

import java.util.Scanner;

public class S06e01 {
    public static void main(String[] args) {
        float number;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        number = userInput.nextFloat();
        
        if (number > 100) {
            System.out.printf("\nThe number %.2f is above 100.\n", number);
        } else {
            number = 0;
        System.out.printf("\n%.0f", number);
        }
        
        userInput.close();

    }
}