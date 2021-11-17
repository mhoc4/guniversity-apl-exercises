package br.com.geekuniversity.com.section06;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class S06e09 {  
        
    public static void main(String[] args) {
        float pollutionIndex;
        
        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter an integer number: ");
        pollutionIndex = userInput.nextFloat();

        if (pollutionIndex > 0.5) {
            System.out.println("All industries groups must suspend their activies.");
        } else if (pollutionIndex >= 0.4 && pollutionIndex < 0.5) {
            System.out.println("Industries of groups 1 and 2 must suspend their activities.");
        } else if (pollutionIndex >= 0.3 && pollutionIndex < 0.4) {
            System.out.println("Industries of group 1 must suspend their activities.");
        } else {
            System.out.println("The pollution index is at acceptable levels.");
        }

        userInput.close();

    }
}