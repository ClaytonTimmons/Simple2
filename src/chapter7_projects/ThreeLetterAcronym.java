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
public class ThreeLetterAcronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tla = "", entry;
        int stringLength;
        int i;
        int count = 0;
        int MAX = 3;
        char c;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter three words.");
        entry = keyboard.nextLine();
        stringLength = entry.length();
        
        tla += Character.toUpperCase(entry.charAt(0));
        ++count;
        
        for(i = 1; i < stringLength; i++)
        {
          if(count < MAX)
          {
            if(entry.charAt(i) == ' ')
            {
            ++i;
            c = entry.charAt(i);
            c = Character.toUpperCase(c);
            tla += c;
            ++count;
            }
          }
        }
        
        System.out.println("Original phrase was "+entry+"\nThree letter acronym is "+tla);
    }
    
}
