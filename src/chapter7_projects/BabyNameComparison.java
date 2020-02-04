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
public class BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String name1 = null, name2 = null, name3 = null;
		String[] names ={name1, name2, name3};
		
		System.out.println("Please enter the names:");
		
		for(int x=0; x<=2;x++)
			names[x]= input.nextLine();
		
			System.out.println(names[0] + " " + names[1] + " " + names[2]);
			System.out.println(names[0] + " " + names[2] + " " + names[1]);
			System.out.println(names[1] + " " + names[2] + " " + names[0]);
			System.out.println(names[1] + " " + names[0] + " " + names[2]);
			System.out.println(names[2] + " " + names[1] + " " + names[0]);
			System.out.println(names[2] + " " + names[0] + " " + names[1]);
    }
    
}
