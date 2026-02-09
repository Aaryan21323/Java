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

public class MinMaxArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter number of elements:");
      int n =sc.nextInt();
      
      int[] arr= new int[n];
      
      for (int i =0;i<n;i++){
          System.out.print("Enter elements"+(i+1)+":");
          arr[i]=sc.nextInt();
      }
      
      int min =arr[0];
      int max = arr[0];
      
      
     for(int i=1;i<n;i++){
         if(arr[i]<min){
             min=arr[i];
         }
         if(arr[i]>max){
             max=arr[i];
         } 
     }
         
         System.out.println("Minimum element="+min);
         System.out.println("Maximum element="+max);
     }
    }
    

