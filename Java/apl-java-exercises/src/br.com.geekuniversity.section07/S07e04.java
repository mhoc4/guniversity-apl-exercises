package br.com.geekuniversity.section07;

import java.util.Scanner;

public class S07e04 {
    
    public static void main(String[] args) {
        int numberInput = -1, biggestNumber = 0, lowestNumber = -1, averageNumber = 0;

        Scanner userInput = new Scanner(System.in);

        for (int counter = 0; counter < 10; counter++) {
            
            while (numberInput < 0) {
            System.out.printf("Please enter an integer and positive number for index %d: ", counter);
            numberInput = userInput.nextInt();
            }
            
            if (numberInput > biggestNumber) {
                biggestNumber = numberInput;
            }

            if (numberInput < lowestNumber || lowestNumber == -1) {
                lowestNumber = numberInput;
            }

            averageNumber += numberInput;
            numberInput = -1;
        }

        averageNumber = averageNumber / 10;
        System.out.printf("\nBiggest number: %d\nLowest number: %d\nAverage Number: %d", biggestNumber, lowestNumber, averageNumber);

        userInput.close();
    }
}