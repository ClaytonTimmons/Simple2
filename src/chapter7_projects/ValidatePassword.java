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
public class ValidatePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputPassword;
    Scanner input = new Scanner(System.in);
    System.out.print("Password: ");
    inputPassword = input.next();
    System.out.println(PassCheck(inputPassword));
    System.out.println("");
  }

  public static String PassCheck(String Password) {
    String result = "Valid Password";
    int length = 0;
    int numCount = 0;
    int capCount = 0;
    for (int x = 0; x < Password.length(); x++) {
      if ((Password.charAt(x) >= 47 && Password.charAt(x) <= 58) || (Password.charAt(x) >= 64 && Password.charAt(x) <= 91) ||
        (Password.charAt(x) >= 97 && Password.charAt(x) <= 122)) {
      } else {
        result = "Password Contains Invalid Character!";
      }
      if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {
        numCount++;
      }
      if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) {
        capCount++;
      }
      length = (x + 1);
    }
    if (numCount < 2) {
      result = "Not Enough Numbers in Password!";
    }
    if (capCount < 2) {
      result = "Not Enough Capital Letters in Password!";
    }
    if (length < 2) {
      result = "Password is Too Short!";
    }
    return (result);
    }
    
}
