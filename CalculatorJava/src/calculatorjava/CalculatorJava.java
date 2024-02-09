/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorjava;

import java.util.Scanner;

/**
 *
 * @author rados
 */
public class CalculatorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int age;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scan.next();
        System.out.println("Enter your age:");
        age = scan.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age); 
    }
    
}
