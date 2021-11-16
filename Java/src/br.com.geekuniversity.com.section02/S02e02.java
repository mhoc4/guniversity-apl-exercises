package br.com.geekuniversity.com.section02;

import java.util.Scanner;

public class S02e02 {
    public static void main(String[] args) {
        float numberOne, numberTwo, result;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a number for number one: ");
        numberOne = userInput.nextFloat();
        
        System.out.println("Please enter a number for number two: ");
        numberTwo = userInput.nextFloat();

        result = (numberOne + numberTwo) * numberOne;

        System.out.println("\nThe result is: " + result);
        
        userInput.close();

    }
}