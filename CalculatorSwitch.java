/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab1120;

/**
 *
 * @author shrijal
 */
import java.util.Scanner;

public class CalculatorSwitch{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        double num1=sc.nextDouble();
        
        System.out.print("Enter second number:");
        double num2 =sc.nextDouble();
        
        System.out.print("Enter an operator (+,-,*,/)");
        char operator =sc.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println("Result="+(num1+num2));
                break;
            case '-':
                System.out.println("Result="+(num1-num2));
                break;
            case '*':
                System.out.println("Result="+(num1*num2));
                break;
            case '/':
                if (num2!=0){
                   System.out.println("Result="+num1/num2); 
                }else{
                    System.out.println("Division by zero is not allowed.");
                    }
                break;
            default:
                System.out.println("Invalid Operator! please use +,-,*,or /.");
       }
        sc.close();
    }
}

