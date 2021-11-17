package br.com.geekuniversity.com.section03;

import java.util.Scanner;

public class S03e07 {
    public static void main(String[] args) {
        float personHeight, idealBMI;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a height value: ");
        personHeight = userInput.nextFloat();
        
        idealBMI = (72.7F * personHeight) - 58;

        System.out.printf("\nFor the height of %.2f the ideal BMI is: %.2f", personHeight, idealBMI);
        
        userInput.close();

    }
}