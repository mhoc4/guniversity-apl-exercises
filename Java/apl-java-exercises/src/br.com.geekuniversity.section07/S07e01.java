package br.com.geekuniversity.section07;

import java.util.Scanner;

public class S07e01 {  
        
    public static void main(String[] args) {
        double numberInput = 1, biggestNumber = 0;
        
        Scanner userInput =  new Scanner(System.in);
        
        while(numberInput != 0) {
            System.out.println("Please enter a number: ");
            numberInput = userInput.nextDouble();
            

            if (numberInput > biggestNumber) {
            biggestNumber = numberInput;
            }
        }
        System.out.printf("The biggest number entered is: %.2f", biggestNumber);

        userInput.close();

    }
}