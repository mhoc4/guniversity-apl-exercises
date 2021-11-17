package br.com.geekuniversity.com.section06;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class S06e08 {  
        
    public static void main(String[] args) {
        int number;
        String evenOrOdd, positiveOrNegative;
        
        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter an integer number: ");
        number = userInput.nextInt();

        if (number % 2 == 0) {
            if (number > 0) {
                evenOrOdd = "even";
                positiveOrNegative = "positive";
            } else {
                evenOrOdd = "even";
                positiveOrNegative = "negative";
            }
        } else {
            if (number > 0) {
                evenOrOdd = "odd";
                positiveOrNegative = "positive";
            } else {
                evenOrOdd = "odd";
                positiveOrNegative = "negative";
            }
        }
        System.out.printf("\nThe number %d is %s and %s.", number, evenOrOdd, positiveOrNegative);

        userInput.close();

    }
}