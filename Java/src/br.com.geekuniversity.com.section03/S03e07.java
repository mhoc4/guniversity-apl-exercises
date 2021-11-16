package br.com.geekuniversity.com.section03;

import java.util.Scanner;

public class S03e07 {
    public static void main(String[] args) {
        float personHeight, idealBMI;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a height value: ");
        personHeight = userInput.nextFloat();
        
        idealBMI = (72.7F * personHeight) - 58;

        System.out.println("\nFor the height of " + personHeight + " the ideal BMI is: " + idealBMI);
        
        userInput.close();

    }
}