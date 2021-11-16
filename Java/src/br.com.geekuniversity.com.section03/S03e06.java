package br.com.geekuniversity.com.section03;

import java.util.Scanner;

public class S03e06 {
    public static void main(String[] args) {
        float workTimeValue, totalWage;
        int monthlyWorkHours;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter the work time value: ");
        workTimeValue = userInput.nextFloat();
        
        System.out.println("Please enter the work hours: ");
        monthlyWorkHours = userInput.nextInt();

        totalWage = workTimeValue * monthlyWorkHours;

        System.out.println("This is how much you gonna earn per month: " + totalWage);
        
        userInput.close();

    }
}