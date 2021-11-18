package br.com.geekuniversity.section07;

import java.util.ArrayList;
import java.util.Scanner;

public class S07e05 {
    
    public static void main(String[] args) {
        String login, senha;

        Scanner userInput = new Scanner(System.in);
            
        do {
            System.out.println("\nPlease enter your login: ");
            login = userInput.next();

            System.out.println("Please enter your password: ");
            senha = userInput.next();

            if (login.equals(senha)) {
                System.out.println("\nYour password must be different than your login.\nPlease try again.");
            }
        } while (login.equals(senha));

        System.out.println("\nYou have succesfully logged in.");

        userInput.close();
    }
}