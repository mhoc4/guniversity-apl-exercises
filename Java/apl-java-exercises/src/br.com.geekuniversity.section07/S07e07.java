package br.com.geekuniversity.section07;

import java.util.Scanner;

public class S07e07 {
    
    public static void main(String[] args) {
        int mouseCode = -1, totalMousesQuantity = 0, needsSphere = 0, needsCleaning = 0, needsConectorOrCableChange = 0, brokenOrUseless = 0;
        float needsSpherePercentage = 0, needsCleaningPercentage = 0, needsConectorOrCableChangePercentage = 0, brokenOrUselessPercentage = 0;
        byte optionCode = -1;

        Scanner userInput = new Scanner(System.in);

        while (mouseCode != 0){
            
            System.out.println("\nPlease enter mouse code or enter 0 to show results: ");
            mouseCode = userInput.nextInt();
            
            if (mouseCode != 0) {
                System.out.println("\nPlease enter an option:\n1 - needs sphere.\n2 - needs cleaning.\n3 - needs conector or cable change.\n4 - broken or useless.");
                optionCode = userInput.nextByte();

                while (optionCode < 1 || optionCode > 4) {
                    System.out.println("\nNo such option code, please try again:\n1 - needs sphere.\n2 - needs cleaning.\n3 - needs conector or cable change.\n4 - broken or useless.");
                    optionCode = userInput.nextByte();
                }

                if (optionCode == 1) {
                    needsSphere++;
                } else if (optionCode == 2) {
                    needsCleaning++;
                } else if (optionCode == 3) {
                    needsConectorOrCableChange++;
                } else {
                    brokenOrUseless++;
                }

                totalMousesQuantity++;
            } 
        }
        
        if (totalMousesQuantity > 0) {
        needsSpherePercentage = ((float) needsSphere / totalMousesQuantity * 100);
        needsCleaningPercentage = ((float) needsCleaning / totalMousesQuantity * 100);
        needsConectorOrCableChangePercentage = ((float) needsConectorOrCableChange / totalMousesQuantity * 100);
        brokenOrUselessPercentage = ((float) brokenOrUseless / totalMousesQuantity * 100);
        }

        System.out.printf("\nMouses quantity: %d\n\n", totalMousesQuantity);
        System.out.printf("Status\t\t\t\t\tQuantity\t\tPercentage");
        System.out.printf("\n1 - Needs sphere\t\t\t%d\t\t\t%.2f%%", needsSphere, needsSpherePercentage);
        System.out.printf("\n2 - Needs cleaning\t\t\t%d\t\t\t%.2f%%", needsCleaning, needsCleaningPercentage);
        System.out.printf("\n3 - Needs conector or cable change\t%d\t\t\t%.2f%%", needsConectorOrCableChange, needsConectorOrCableChangePercentage);
        System.out.printf("\n4 - Broken or useless\t\t\t%d\t\t\t%.2f%%\n", brokenOrUseless, brokenOrUselessPercentage);

        userInput.close();
    }
}