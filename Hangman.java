/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joshu
 */

public class Hangman {
     public static int wrongCounter = 0;{}
    
   // public static int wrongCounter = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random myRandom = new Random();
        Scanner scnr = new Scanner(System.in);
      //3
      HangMethods hang = new HangMethods();
    
      WordSelector wordy = new WordSelector();
        
       
       
        int lettersPrinted = 0;
        boolean keepGoing = false;
        String mysteryWord = "";
        ArrayList<Character> previousGuesses = new ArrayList<>();
        int charsPrinted = 0;
        
        
        
            System.out.print("Please select either word length 3 or 4: ");
            wordy.setWordLength(scnr.nextInt());
            scnr.nextLine();
            wordy.decideWord();
            System.out.print("Please enter the amount of chances you would like: ");
            int chances = scnr.nextInt();
            scnr.nextLine();
       
        char[] wordArray = new char[wordy.getWordLength()];

        while (wrongCounter < chances) {
            charsPrinted = 0;
            if (lettersPrinted == wordy.getWordLength()) {
                System.out.printf("Congratlations! You win! The word was %s.\n", wordy.getMysteryWord());
                break;
            }
            System.out.print("Please enter a guess: ");
            
            String currentGuess = scnr.nextLine();
            lettersPrinted = 0;
            previousGuesses.add(currentGuess.charAt(0));
            if (wordy.getMysteryWord().contains(currentGuess)) {//hang.hangHim();
                
                if (wordy.getMysteryWord().equals(currentGuess)) {
                 
                    System.out.println("Correct! The word was " + wordy.getMysteryWord() + ". You win!");
                    break;

                }
                wordArray = wordy.getMysteryWord().toCharArray();

                for (int i = 0; i < wordy.getWordLength(); i++) {

                    if (previousGuesses.contains(wordArray[i])) {
                        if (charsPrinted == wordy.getWordLength()) {
                            break;
                        }

                        System.out.print(wordArray[i] + " ");

                        charsPrinted++;

                        lettersPrinted++;

                    } else {
                        if (charsPrinted == wordy.getWordLength()) {
                            break;
                        }

                        System.out.print("__ ");
                        charsPrinted++;
                    }
                    

                }
                System.out.println();
                //hang.hangHim();
                //System.out.println();
            } //need to add picture drawing for Wrong guesses-jj
            else {
                wrongCounter++;
               // hang.hangHim();
                System.out.print("WRONG");
                System.out.printf(" You have %d more chances\n", chances - wrongCounter);
                
                if (wrongCounter == chances) {
                    System.out.printf("Sorry, the word was %s\n", wordy.getMysteryWord());
                    //hang.hangHim();
                }
                else
                {
                   // hang.hangHim();
                }

            }

        }

    }
}
