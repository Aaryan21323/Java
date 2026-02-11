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

public class LowestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        // Finding lowest number
        if (a <= b && a <= c) {
            System.out.println("Lowest number is: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Lowest number is: " + b);
        } else {
            System.out.println("Lowest number is: " + c);
        }

        sc.close();
    }
}

