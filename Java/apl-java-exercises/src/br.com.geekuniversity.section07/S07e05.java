package br.com.geekuniversity.section07;

import java.util.Scanner;

public class S07e05 {
    
    public static void main(String[] args) {
        String login, senha;

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nPlease enter your login: ");
        login = userInput.next();

        System.out.println("Please enter your password: ");
        senha = userInput.next();

        while (login.equals(senha)) {

            System.out.println("\nYour password must be different than your login.\nPlease try again.");

            System.out.println("\nPlease enter your login: ");
            login = userInput.next();

            System.out.println("Please enter your password: ");
            senha = userInput.next();
        }
           
        System.out.println("\nAccount succesfully created.");

        userInput.close();
    }
}