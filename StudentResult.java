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

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int m5 = sc.nextInt();

        // Check pass or fail
        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {

            int total = m1 + m2 + m3 + m4 + m5;
            double percentage = total / 5.0;

            System.out.println("\nResult: PASS");
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");

            // Division
            if (percentage >= 60) {
                System.out.println("Division: First Division");
            } else if (percentage >= 45) {
                System.out.println("Division: Second Division");
            } else {
                System.out.println("Division: Third Division");
            }

        } else {
            System.out.println("\nResult: FAIL");
            System.out.println("You have failed in one or more subjects.");
        }

        sc.close();
    }
}

