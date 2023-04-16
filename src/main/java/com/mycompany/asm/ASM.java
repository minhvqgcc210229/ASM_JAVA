/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asm;
import Model.Racket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author vuong
 */
public class ASM {
    
    private static final Map<String, String> user = new HashMap<>();
    private static final List<Racket> Store = new ArrayList<>();
    
    public static void main(String[] args) {
        //Add some example users to the data store
        user.put("admin", "admin123");
        
         //Prompt the user for a username and password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
         //Check if the username and password are valid
        if (isValidLogin(username  , password)) {
//            System.out.println("Login successful!");
            admin.run(Store);
        }else{
            System.out.print("login fail");
        }
    }
     private static boolean isValidLogin(String username, String password) {
        // Check if the username is in the data store
        if (user.containsKey(username)) {
            // Check if the password matches the stored password for the user
            if (user.get(username).equals(password)) {
                return true;
            }
        }
        return false;
    }
}

