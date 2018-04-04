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
        int difficulty = 3;
        int wrongCounter = 0;
        String[] threeLetterWords = {"axe","bum","dag","elk","fog","hal","ion","men","nun","aaa"};
        //Arrays of other word lengths need to be added along with a difficulty selecction-jj
       
        String mysteryWord = threeLetterWords[myRandom.nextInt(9)];
        
        
        char[] wordArray = new char[difficulty];
      
        
        while(wrongCounter<(difficulty+3)){
            System.out.print("Please enter a guess: ");
        String firstGuess = scnr.nextLine();
        if(mysteryWord.contains(firstGuess))
        {
            wordArray = mysteryWord.toCharArray();
            for(int i =0; i<difficulty; i++)
            {
                if(wordArray[i]== firstGuess.charAt(0))
                {
                    System.out.print(firstGuess);
                }
                else
                {
                    System.out.print("__");
                }
            }
        }
        // correct functionality neeced to be added for wrong guesses-jj
        //need to add picture drawing for Wrong guesses and a game over message-jj
        else
        {
            System.out.println("WRONG");
            wrongCounter++;
        }
        }
        //need to add exit point for correct asnwers=jj
        //need to add functionality to print words including past printed characters -jj
        
        
        
                
                }
    }
