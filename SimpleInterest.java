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

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User inputs
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Simple Interest calculation
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest is: " + simpleInterest);

        sc.close();
    }
}

