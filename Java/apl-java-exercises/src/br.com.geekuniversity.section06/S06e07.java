package br.com.geekuniversity.section06;

import java.util.Scanner;

public class S06e07 {
    public static void main(String[] args) {
        float numbers[] = new float[4], numbersSquares[] = new float[4];

        Scanner userInput =  new Scanner(System.in);
        
        for (int counter = 0; counter < 4; counter++) {
        System.out.printf("Please enter a number for index %d: ", counter);
        numbers[counter] = userInput.nextFloat();
        numbersSquares[counter] = numbers[counter] * numbers[counter];
        }
        
        if (numbersSquares[2] > 1000) {
            System.out.printf("\n%.2f", numbersSquares[2]);
        } else {
            for (int counter = 0; counter < 4; counter++) {
            System.out.printf("\nNumber: %.2f Number Square: %.2f", numbers[counter], numbersSquares[counter]);
            }
        }
        
        userInput.close();

    }
}