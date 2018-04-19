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
    private int wordType;
    Scanner scnr = new Scanner(System.in);
    private String mysteryWord = "";
    private String[][] threeLetterWords = {{"dog","dad","toy"},
                                        {"sad","rat","fat"},
                                        {"ham","tan","bum"}};
    
    private String[][] fourLetterWords = {{"cool", "love", "luck"},
                                         {"muck", "kill", "hell"},
                                         {"poop","porg","cart"}};

    Random myRandom = new Random();
    public int getWordLength()
    {
        return wordLength;
    }

    public void setWordType(int wordType) {
        this.wordType = wordType;
    }

    public int getWordType() {
        return wordType;
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
                    mysteryWord = threeLetterWords [wordType] [myRandom.nextInt(threeLetterWords.length - 1)];
                    keepGoing = false;
                    break;

                case 4:
                    mysteryWord = fourLetterWords [wordType] [myRandom.nextInt(fourLetterWords.length - 1)];
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
