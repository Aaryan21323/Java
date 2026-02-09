/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab1120;

/**
 *
 * @author shrijal
 */
public class StarPattern {
    public static void main(String[] args){
        int n=5;
        
        for (int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
            System.out.print("*");
           }
            
            for(int j=1;j<=2*(n-i);j++){
              System.out.print(" ");
            }
              
              for( int j=1;j<=i;j++){
                  System.out.print("*");
              }
              
              System.out.println();
            }
        }
    }

