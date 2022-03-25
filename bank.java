/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memusse;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class musseBank {
     public static void main(String[] args){
        System.out.println("WELCOME TO XYZ BANK.");
    System.out.println("ACCOUNT TYPES AT XYZ BANK;");
    System.out.println("1. REGULAR ACCOUNT.");
    System.out.println("2. INTEREST ACCOUNT.");
    System.out.println("3. CHECKING ACCOUNT.");
    System.out.println("4. CD ACCOUNT.");
   
    Scanner scn= new Scanner(System.in);
    System.out.println("TO VIEW RATES ENTER THE ACCOUNT PIN");
    int PIN= scn.nextInt();
    if(PIN==2000){
        System.out.println("REGULAR ACCOUNT");
        System.out.println("CHARGES ARE 10% OF THE BALANCE EVERY MONTH");
        System.out.println("PENALITY IF OF 10.00 WHEN BALANCE GOES BELOW 50000.00");
    }
        else if(PIN==2001){
        System.out.println("INTEREST ACCOUNT");
        System.out.println("CHARGES ARE 10% OF THE BALANCE EVERY MONTH");
        System.out.println("INTEREST OF 7% paid monthly");
        System.out.println("NO MINIMUM BALANCE NEEDED");
}
    else if(PIN==2003){
        System.out.println("CHECKING ACCOUNT");
        System.out.println("CHARGES ARE 10% OF THE BALANCE EVERY MONTH");
        System.out.println("INTERESTS IS OF 7% ANNUALLY PAID MONTHLY");
        System.out.println("PENALITY IF OF 10.00 WHEN BALANCE GOES BELOW 10000.00");
        
}
    else if(PIN==2004){
         System.out.println("CD ACCOUNT.");
         System.out.println("CHARGES ARE 10% OF THE BALANCE EVERY MONTH");
         System.out.println("Penalty of 20% of the balance when withdra is made before 12 months from oppening of the account");
         
    }
    else{
        System.out.println("WRONG PIN ENTERED");
        main(null);
    }
}    
} 

