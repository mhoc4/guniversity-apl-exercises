package br.com.geekuniversity.section07;

import java.util.Scanner;

public class S07e06 {
    
    public static void main(String[] args) {
        int number;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10 to calculate it's times table: ");
        number = userInput.nextInt();
        
        while (number < 1 || number > 10) {
            System.out.println("The number must be between 1 and 10, please try again.");
            number = userInput.nextInt();
        }

        System.out.printf("\n%d times table: \n", number);
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("\n%d X %d = %d", number, counter, number * counter);
        }

        userInput.close();
    }
}