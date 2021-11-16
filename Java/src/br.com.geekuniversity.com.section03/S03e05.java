package br.com.geekuniversity.com.section03;

import java.util.Scanner;

public class S03e05 {
    public static void main(String[] args) {
        int centimeters, meters;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter the value in meters: ");
        meters = userInput.nextInt();
        
        centimeters = meters * 100;

        System.out.println("\n"+ meters +" meters in centimeters is: " + centimeters);
        
        userInput.close();

    }
}