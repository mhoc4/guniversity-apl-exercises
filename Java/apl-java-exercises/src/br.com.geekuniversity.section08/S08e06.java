package br.com.geekuniversity.section08;

import java.util.Scanner;

public class S08e06 {
    
    public static void main(String[] args) {
        int optionCode = -1;
        float numbers[] = new float[5];

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nPlease enter a option code:\n1 - Show the numbers in entered order.\n2 - Show the numbers in reverse as entered order.\n0 - Quit.");
        optionCode = userInput.nextInt();

        while(optionCode < 0 || optionCode > 2) {
            System.out.println("\nNo such code, please choose between 0 and 2.\n\n1 - Show the numbers in entered order.\n2 - Show the numbers in reverse as entered order.\n0 - Quit.");
            optionCode = userInput.nextInt();
        }

        if (optionCode != 0) {
            for (int counter = 0; counter < numbers.length; counter++) {
                System.out.printf("\nPlease enter a real number for the position %d/5:\n", counter+1);
                numbers[counter] = userInput.nextFloat();
            }

            if (optionCode == 1) {
                System.out.println("\nShowing the numbers in direct order: ");
                for (int index = 0; index < numbers.length; index++) {
                System.out.println(numbers[index]);
                }
            } else {
                System.out.println("\nShowing the numbers in reverse order: ");
                for (int index = 4; index >= 0; index--) {
                    System.out.println(numbers[index]);
                }
            }
        } else {
            System.out.println("\nYou chose to quit.");
        }

        userInput.close();
    }
}