package br.com.geekuniversity.section06;

import java.util.Scanner;

public class S06e10 {  
        
    public static void main(String[] args) {
        int swimmerAge;
        String category = "not in a category";
        
        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter an integer number: ");
        swimmerAge = userInput.nextInt();

        if (swimmerAge >= 18) {
            category = "Adult";
        } else if (swimmerAge >= 14) {
            category = "juvenile B";
        } else if (swimmerAge >= 12) {
            category = "juvenile A";
        } else if (swimmerAge >= 8) {
            category = "child B";
        } else if (swimmerAge >= 5) {
            category = "child A";
        } 
        System.out.printf("\n%s", category);

        userInput.close();

    }
}