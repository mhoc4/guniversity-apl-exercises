package br.com.geekuniversity.com.section06;

import java.util.Scanner;

public class S06e05 {
    public static void main(String[] args) {
        float p, e, m, weightlimit = 50.00F;
        int fineValuePerKg = 4;   

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter the total fish caught weight: ");
        p = userInput.nextFloat();

        if (p > weightlimit) {
            e = p - weightlimit;
            m = e * fineValuePerKg;
            
        } else {
            e = 0;
            m = 0;
        }

        System.out.printf("\nFish caught weight: %.2f\nAbove weight limit: %.2f\nFine: R$ %.2f\n", p, e, m);
        
        userInput.close();

    }
}