package br.com.geekuniversity.section03;

import java.util.Scanner;

public class S03e04 {
    public static void main(String[] args) {
        float numberOne, numberTwo, result;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter the first number: ");
        numberOne = userInput.nextFloat();
        
        System.out.println("Please enter the second number: ");
        numberTwo = userInput.nextFloat();

        result = numberOne + numberTwo;

        System.out.println("\nThe sum result is: " + result);
        
        userInput.close();

    }
}