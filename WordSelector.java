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
public class WordSelector {
    private int wordLength;
    Scanner scnr = new Scanner(System.in);
    private String mysteryWord = "";
    private String[] threeLetterWords = {"axe", "bum", "dog", "elk", "fog", "ham", "ion", "men", "nun", "cat", "run", "rid", "dig", "kid"};
    private String[] fourLetterWords = {"help", "love", "luck", "muck", "joke", "poop", "kill", "find", "mind", "read", "shoe", "hair", "dogs", "clap", "hard", "soft", "rest", "nest", "best", "cool"};

    Random myRandom = new Random();
    public int getWordLength()
    {
        return wordLength;
    }
    
    public void setWordLength(int l)
    {
        wordLength = l;
    }
    
    public String getMysteryWord()
    {
        return mysteryWord;
    }
    
    public void decideWord()
    {
        boolean keepGoing;
        do{
        switch (wordLength) {
                case 3:
                    mysteryWord = threeLetterWords[myRandom.nextInt(threeLetterWords.length - 1)];
                    keepGoing = false;
                    break;

                case 4:
                    mysteryWord = fourLetterWords[myRandom.nextInt(fourLetterWords.length - 1)];
                    keepGoing = false;
                    break;

                default:
                    System.out.print("Value out of range. Please enter a word length either 3 or 4: ");
                    wordLength = scnr.nextInt();
                    scnr.nextLine();
                    keepGoing = true;
                    break;
    }
        }while(keepGoing);
    
    
    
}
}
