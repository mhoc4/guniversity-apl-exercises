package br.com.geekuniversity.section07;

public class S07e02 {
    
    public static void main(String[] args) {

        for (int counter = 1; counter <= 100; counter++) {
            
            if (counter % 10 != 0) {
                System.out.println(counter);
            } else {
                System.out.println("Multiple of 10: " + counter);
            }
        }

    }
}