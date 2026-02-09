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

public class MatrixSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int[][] A= new int[2][2];
        int[][] B= new int[2][2];
        int[][] sum= new int[2][2];
                
        System.out.println("Enter elements of first 2*2 matrix:");
        for(int i=0;i<2;i++){
            for (int j=0; j<2;j++){
                A[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter elements of second 2*2 matrix:");
        for(int i=0;i<2;i++){
            for (int j=0; j<2;j++){
                B[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        
        System.out.println("Sum of matrices:");
          for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
          sc.close();
        
}
}
