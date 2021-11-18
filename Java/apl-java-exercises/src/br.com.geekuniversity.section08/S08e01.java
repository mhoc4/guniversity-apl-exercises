package br.com.geekuniversity.section08;

import java.util.ArrayList;
import java.util.Scanner;

public class S08e01 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        Scanner userInput = new Scanner(System.in);

        for (int counter = 0; counter < 5; counter++){
        
            System.out.printf("Please enter a number for index %d: \n", counter);
            numbers.add(userInput.nextInt());

            if (numbers.get(counter) % 2 == 0 && numbers.get(counter) > 0) {
                evenNumbers.add(numbers.get(counter));
            }
        }
        
        System.out.println("\nEven numbers: ");
        for (Integer n : evenNumbers) {
            System.out.println(n);
        }

        userInput.close();
    }
}