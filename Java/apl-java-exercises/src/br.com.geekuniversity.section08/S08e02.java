package br.com.geekuniversity.section08;

import java.util.ArrayList;
import java.util.Scanner;

public class S08e02 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbersOne = new ArrayList<Integer>();
        ArrayList<Integer> numbersTwo = new ArrayList<Integer>();
        ArrayList<Integer> sumOfNumbers = new ArrayList<Integer>();

        Scanner userInput = new Scanner(System.in);

        for (int counter = 0; counter < 10; counter++){
        
            System.out.printf("Please enter a value for the first number at index %d: \n", counter);
            numbersOne.add(userInput.nextInt());
            
            System.out.printf("Please enter a value for the second number at index %d: \n", counter);
            numbersTwo.add(userInput.nextInt());

            sumOfNumbers.add(numbersOne.get(counter) + numbersTwo.get(counter));
        }
        
        for (int counter = 0; counter < sumOfNumbers.size();counter++) {
            System.out.printf("\nSum of numbers at index %d: %d", counter, sumOfNumbers.get(counter));
        }

        userInput.close();
    }
}