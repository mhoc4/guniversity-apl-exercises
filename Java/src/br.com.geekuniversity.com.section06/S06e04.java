package br.com.geekuniversity.com.section06;

import java.util.Scanner;

public class S06e04 {
    public static void main(String[] args) {
        float personHeight, idealBMI = 0;
        String gender = "repeat";

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a height: ");
        personHeight = userInput.nextFloat();
        
        while (gender.equals("repeat")) {
        
            System.out.println("\nPlease enter a gender f/m: ");
            gender = userInput.next().strip();

            if (gender.charAt(0) == 'f') {
                idealBMI = (62.1F * personHeight) - 44.7F;
                gender = "feminine";
                
            } else if (gender.charAt(0) == 'm') {
                idealBMI = (72.7F * personHeight) - 58F;
                gender = "masculine";
                
            } else {
                gender = "repeat";
            }

        }


        System.out.printf("\nThe ideal BMI for a height of %.2f and %s gender is: \n%.2f\n", personHeight, gender, idealBMI);
        
        userInput.close();

    }
}