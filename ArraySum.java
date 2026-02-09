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

public class ArraySum {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter number of elements:");
      int n =sc.nextInt();
      
      int[] arr= new int[n];
      
      for (int i =0;i<n;i++){
          System.out.print("Enter elements"+(i+1)+":");
          arr[i]=sc.nextInt();
      }
      
     int sum=0;
     
     for (int i =0;i<n;i++){
          sum=sum+arr[i];
      }
         
     
     System.out.println("sum="+sum);
    }
}
