package br.com.geekuniversity.section08;

import java.util.Scanner;

public class S08e05 {
    
    public static void main(String[] args) {
        int numbersInput[] = new int[10];
        boolean isThereNumberAboveFifty = false;

        Scanner userInput = new Scanner(System.in);
       
        for (int index = 0; index < 10; index++) {
            System.out.printf("\nPlease enter a number %d/10.\n", index+1);
            numbersInput[index] = userInput.nextInt();

        }

        for (int index = 0; index < numbersInput.length; index++) {
            
            if (numbersInput[index] > 50){
            System.out.printf("\nThe number %d at index %d is above 50.\n", numbersInput[index], index);
            isThereNumberAboveFifty = true;
            }
        }

        if (!isThereNumberAboveFifty) {
            System.out.println("\nThere is no number above 50.");
        }
        
        userInput.close();
    }
}