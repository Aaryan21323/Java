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
import java.util.Arrays;

public class AlphabeticalOrder {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter number of names:");
       int n=sc.nextInt();
       sc.nextLine();
       
       String[] names= new String[n];
       
       for(int i=0;i <n;i++){
           System.out.print("Enter name"+(i+1)+":");
           names[i]=sc.nextLine();
       }
       
       Arrays.sort(names);
       
       System.out.println("\nName in alphabetical order:");
       for(int i=0;i<n;i++){
           System.out.println(names[i]);
       }
       sc.close();
   } 
}
