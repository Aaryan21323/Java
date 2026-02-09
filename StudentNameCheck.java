/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab1120;

/**
 *
 * @author shrijal
 */
public class StudentNameCheck {
    public static void main(String[] args){
      String[] students={"Amit","Sita","Ram","Nitin"};
      
      System.out.println("Students whose name contains 't':");
      
      for(int i=0; i<students.length;i++){
        if(students[i].toLowerCase().contains("t")){
            System.out.println(students[i]);
        }
      }   
     }
    }

