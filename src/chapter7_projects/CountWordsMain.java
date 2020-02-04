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
public class CountWordsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String inputString;
       Scanner keyboard = new Scanner(System.in);
       do{
           
           //sentinal loop until user enters Done
           //look at the methods that drop
           System.out.println("Please enter a sentence. Type Done to quit");
           inputString = keyboard.nextLine();
           if(inputString.equalsIgnoreCase("done")){
               //ignore 
           }
           else{
                   System.out.println("You entered " + inputString);
                   CountWords stats = new CountWords(inputString);
                   System.out.println(stats.toString());
           }
 
       }while(!inputString.equalsIgnoreCase("Done"));

    }
    
}
