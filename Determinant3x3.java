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

public class Determinant3x3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] m =new int[3][3];
        
        System.out.println("Enter elements of 3x3 matix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=sc.nextInt();
            }
        }
        
        int det = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        
        System.out.println("Determinant="+det);
        sc.close();
    }  
}
