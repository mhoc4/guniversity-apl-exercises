package br.com.geekuniversity.section08;

import java.util.ArrayList;
import java.util.Scanner;

public class S08e03 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner userInput = new Scanner(System.in);

        for (int counter = 0; counter < 10; counter++){
        
            System.out.printf("Please enter a value for the number at index %d: \n", counter);
            numbers.add(userInput.nextInt());
        }
        
        for (int counter = numbers.size()-1; counter >= 0;counter--) {
            System.out.printf("\nNumber at index %d: %d", counter, numbers.get(counter));
        }

        userInput.close();
    }
}