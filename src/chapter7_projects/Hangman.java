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
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char userChoice;
    String secretPhrase = "GO TEAM";
    Scanner input = new Scanner(System.in);
    String hint = "G* T***";
    StringBuilder secretWord = new StringBuilder(hint);

    System.out.println("The hint is " + hint); 

    System.out.println("Please guess a letter");
    userChoice = Character.toUpperCase(input.nextLine().charAt(0)); 

    int asteriskAmount = hint.length() - 1; 
    int guessedLetters = 2; 

    while(guessedLetters < asteriskAmount) {
        boolean isInPhrase = checkLetter(userChoice, secretPhrase);
        if(isInPhrase) { 
            int position = getPosition(userChoice, secretPhrase); 
            secretWord.setCharAt(position, userChoice);
            hint = secretWord.toString();
            guessedLetters++; 
            System.out.println(secretWord);
            System.out.println("Please guess a letter");
            userChoice = Character.toUpperCase(input.nextLine().charAt(0));
        }
        else {
            System.out.println("That letter is not in the phrase. Please try again >>> ");
            userChoice = Character.toUpperCase(input.nextLine().charAt(0));
        }
    }
    System.out.println("You got it! The secret word is " + secretWord);


}
public static boolean checkLetter(char userChoice, String secretPhrase) {
    boolean isInPhrase = false;
    int amountOfLetters = 0;
    for(int x = 0; x < secretPhrase.length(); x++) {
        if(userChoice != secretPhrase.charAt(x)) {
            isInPhrase = false;
        }
        else {
            isInPhrase = true;
            amountOfLetters++;
        }
    }
    if(amountOfLetters >= 1) {
        isInPhrase = true;
    }
    return isInPhrase;
}
public static int getPosition(char userChoice, String secretPhrase) {
    int position;
    int x = 0;
    while(userChoice != secretPhrase.charAt(x)) {
        x++;
    }
    position = x;
    return position;
    }
    
}
