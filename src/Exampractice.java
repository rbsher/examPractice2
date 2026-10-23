/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rbake
 */

import java.util.Random;
import java.util.Scanner;

public class Exampractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Rylan!");
        
        Random random = new Random();
        Scanner read = new Scanner(System.in);
        
        String y = read.nextLine();
        
        int x = random.nextInt(17);
        
        if (x > 8) {
            System.out.println("This number is above 8!");
            System.out.println(y);
        }
        else {
            System.out.println("This number is not above 8...");
        }
        
        while (x > 0) {
            System.out.println("Wow, " + x + " is the number now");
            x -=1 ;
        }
        System.out.println("Oops, x is now 0...");
        
        
    }
    
}
