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

public class PersonalDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter your Date of Birth (DD/MM/YYYY): ");
        String dob = sc.nextLine();

        // Display output
        System.out.println("\n--- Personal Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("DOB    : " + dob);

        sc.close();
    }
}

