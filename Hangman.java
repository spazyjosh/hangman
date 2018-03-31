/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random myRandom = new Random();
        Scanner scnr = new Scanner(System.in);
        String[] threeLetterWords = {"axe","bum","dag","elk","fog","hal","ion","men","nun","aaa"};
        //Arrays of other word lengths need to be added along with a difficulty selecction-jj
       
        String mysteryWord = threeLetterWords[9];
        //will be replaced to choose a random integer, currently trying to get functionality for words with multiple character occurrences using "aaa" -jj
        
        
        System.out.print("Please enter a guess: ");
        String firstGuess = scnr.nextLine();
        
        if(mysteryWord.contains(firstGuess))
        {
            System.out.println(mysteryWord.charAt(mysteryWord.indexOf(firstGuess)));
            // need to add __ at every other spot in the word
        }
        // correct functionality neeced to be added for wrong guesses
        else
        {
            System.out.println("WRONG");
        }
        
        
        
        
        
                
                }
    }
