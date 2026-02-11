/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author Students
 */
import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Finding greatest number
        if (a > b) {
            System.out.println("Greatest number is: " + a);
        } else if (b > a) {
            System.out.println("Greatest number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}

