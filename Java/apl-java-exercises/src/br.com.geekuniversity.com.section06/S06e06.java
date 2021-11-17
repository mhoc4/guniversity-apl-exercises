package br.com.geekuniversity.com.section06;

import java.util.Scanner;

public class S06e06 {
    public static void main(String[] args) {
        int c, n, workHoursLimit = 50; 
        float e, totalWage, totalOvertimeWage, regularWorkHoursValue = 10.00F, overTimeWorkHoursValue = 20.00F;

        Scanner userInput =  new Scanner(System.in);
        
        System.out.println("Please enter the employee code: ");
        c = userInput.nextInt();
        
        System.out.println("Please enter how much work hours: ");
        n = userInput.nextInt();

        if (n > workHoursLimit) {
            e = n - workHoursLimit;
            totalOvertimeWage = overTimeWorkHoursValue * e;
            totalWage = (regularWorkHoursValue * workHoursLimit) + totalOvertimeWage;
        } else {
            totalOvertimeWage = 0.00F;
            totalWage = regularWorkHoursValue * n;
        }

        System.out.printf("\nEmployee code %s\nTotal Wage: R$ %.2f\nTotal Overtime Wage: R$ %.2f\n", c, totalWage, totalOvertimeWage);
        
        userInput.close();

    }
}