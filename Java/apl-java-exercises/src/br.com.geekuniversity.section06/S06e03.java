package br.com.geekuniversity.section06;

import java.util.Scanner;

public class S06e03 {
    public static void main(String[] args) {
        float number, p = 0, i = 0;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        number = userInput.nextFloat();
        
        if (number % 2 == 0) {
            p = number;
        } else {
            i = number;
        }

        System.out.println("\n"+ p);
        System.out.println(i);
        
        userInput.close();

    }
}