/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7_projects;

import java.util.Scanner;

/**
 *
 * @author minab
 */
public class PhoneNumberFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a ten-digit phone number: ");
        String n = in.next();

        String areaCode = "(" + n.substring(0, 3) + ") ";
        String formattedNumber = areaCode + n.substring(3, 6) + "-" + n.substring(6);
        System.out.println("Formatted number: " + formattedNumber);
    }
    
}
