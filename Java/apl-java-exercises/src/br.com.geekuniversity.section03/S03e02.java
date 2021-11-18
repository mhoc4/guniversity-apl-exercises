package br.com.geekuniversity.section03;

import java.util.Scanner;

public class S03e02 {
    public static void main(String[] args) {
        float mediumStock, minimumStock, maximumStock;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter a number for minimmum stock: ");
        minimumStock = userInput.nextFloat();
        
        System.out.println("Please enter a number for maximum stock: ");
        maximumStock = userInput.nextFloat();

        mediumStock = (minimumStock + maximumStock) / 2;

        System.out.println("\nThe medium stock is: " + mediumStock);
        
        userInput.close();

    }
}