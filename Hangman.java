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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random myRandom = new Random();
        Scanner scnr = new Scanner(System.in);
        int difficulty;
        int wrongCounter = 0;
        int lettersPrinted = 0;
        boolean keepGoing = false;
        String mysteryWord = "";
        ArrayList<Character> previousGuesses = new ArrayList<>();
        int charsPrinted = 0;
        String[] threeLetterWords = {"axe", "bum", "dog", "elk", "fog", "ham", "ion", "men", "nun", "cat", "run", "rid", "dig", "kid"};
        String[] fourLetterWords = {"help", "love", "luck", "muck", "joke", "poop", "kill", "find", "mind", "read", "shoe", "hair", "dogs", "clap", "hard", "soft", "rest", "nest", "best", "cool"};

        do {
            System.out.print("Please select either difficulty 3 or 4: ");
            difficulty = scnr.nextInt();
            scnr.nextLine();
            switch (difficulty) {
                case 3:
                    mysteryWord = threeLetterWords[myRandom.nextInt(threeLetterWords.length - 1)];
                    break;

                case 4:
                    mysteryWord = fourLetterWords[myRandom.nextInt(fourLetterWords.length - 1)];
                    break;

                default:
                    System.out.println("Value out of range.");
                    keepGoing = true;
                    break;
            }
        } while (keepGoing);
        char[] wordArray = new char[difficulty];

        while (wrongCounter < (difficulty + 3)) {
            charsPrinted = 0;
            if (lettersPrinted == difficulty) {
                System.out.printf("Congratlations! You win! The word was %s.\n", mysteryWord);
                break;
            }
            System.out.print("Please enter a guess: ");
            String currentGuess = scnr.nextLine();
            lettersPrinted = 0;
            previousGuesses.add(currentGuess.charAt(0));
            if (mysteryWord.contains(currentGuess)) {
                if (mysteryWord.equals(currentGuess)) {
                    System.out.println("Correct! The word was " + mysteryWord + ". You win!");
                    break;

                }
                wordArray = mysteryWord.toCharArray();

                for (int i = 0; i < difficulty; i++) {

                    if (previousGuesses.contains(wordArray[i])) {
                        if (charsPrinted == difficulty) {
                            break;
                        }

                        System.out.print(wordArray[i] + " ");

                        charsPrinted++;

                        lettersPrinted++;

                    } else {
                        if (charsPrinted == difficulty) {
                            break;
                        }

                        System.out.print("__ ");
                        charsPrinted++;
                    }

                }
                System.out.println();
            } //need to add picture drawing for Wrong guesses and a game over message-jj
            else {
                System.out.print("WRONG");
                wrongCounter++;
                System.out.printf(" You have %d more chances\n", (difficulty + 3) - wrongCounter);
                if (wrongCounter == difficulty + 3) {
                    System.out.printf("Sorry, the word was %s\n", mysteryWord);
                }

            }

        }

    }
}
