/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm;
import Model.Racket;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author vuong
 */
public class admin {
      public static void run(List<Racket> Store){
          while(true){
          System.out.println("1. Show Badminton Racket");
        System.out.println("2. Insert Badminton Racket");
        System.out.println("3. Update Badminton Racket");
        System.out.println("4. Delete Badminton Racket");
        System.out.println("5. Find");
        System.out.println("6. Exit");
        System.out.println("Choose: "); 
          Scanner sc = new Scanner(System.in);
          int choose;
     
              choose = Integer.parseInt(sc.nextLine());
              switch(choose){
                    case 1 -> BadmintonRacket();
                    case 2 -> InsertRacket();
                    case 3 -> UpdateRacket();
                    case 4 -> DeleteRacket();
                    case 5 -> FindRacket();
                    case 6 -> System.out.println("Exit");
                    default -> System.out.println("Fail");
          }
      
          }
        
}

    private static void BadmintonRacket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void InsertRacket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void DeleteRacket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void FindRacket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void UpdateRacket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
      
         
      
}
