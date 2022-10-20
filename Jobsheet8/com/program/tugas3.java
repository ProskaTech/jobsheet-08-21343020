package com.program;

public class tugas3 {
    public static void main(String[] args) {
        
        String [][] dogs = {{"Florence","735-1234", "Manila"},
                            {"Joyce","983-3333", "Quezon City"},
                            {"Becca","456-3322", "Manila"},
                            };

        for (int row = 0; row < dogs.length; row++) {
 
                System.out.println("Name    : "+dogs[row][0]);
                System.out.println("Tel.#   : "+dogs[row][1]);
                System.out.println("Address : "+dogs[row][2]);
                System.out.println("");
            }
        } 
}
