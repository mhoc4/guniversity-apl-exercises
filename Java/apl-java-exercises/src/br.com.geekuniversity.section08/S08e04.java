package br.com.geekuniversity.section08;

import java.util.Scanner;

public class S08e04 {
    
    public static void main(String[] args) {
        int sumOfNumbers = 0;

        Scanner userInput = new Scanner(System.in);
       
        for (int counter = 1; counter <= 20; counter++) {
            System.out.printf("\nPlease enter a number %d/20.\n", counter);
            sumOfNumbers += userInput.nextInt();
        }
        System.out.printf("\nThe total sum is: %d.\n", sumOfNumbers);

        userInput.close();
    }
}