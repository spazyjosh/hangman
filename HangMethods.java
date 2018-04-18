/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author joshu
 */
public class HangMethods {
    Hangman myHang = new Hangman();
    public void hangHim()
    {
        //hangman ascii art from www.berkleyinternet.com/perl/node30.htm
        switch(Hangman.wrongCounter)
        {
            case 0:
                //System.out.println("");
                
                break;
            case 1:
                System.out.println("|");
               // System.out.println("");
                break;
            case 2:
                System.out.println("|");
                System.out.println("|");
              //  System.out.println("");
                break;
            case 3:
               System.out.println("|        / \\  ");
                System.out.println("|");
                System.out.println("|");
                
                break;
            case 4:
                System.out.println("|        /|\\  ");
                System.out.println("|        / \\  ");
                System.out.println("|");
                System.out.println("|");
              //  System.out.println("");
                break;
            case 5:
                System.out.println("|         0    ");
                System.out.println("|        /|\\  ");
                System.out.println("|        / \\  ");
                System.out.println("|");
                System.out.println("|");
             //   System.out.println("");
                
                break;
            case 6:
                System.out.println("|         |    ");
                System.out.println("|         0    ");
                System.out.println("|        /|\\  ");
                System.out.println("|        / \\  ");
                System.out.println("|");
                System.out.println("|");
             //   System.out.println("");
                break;
            case 7:
                System.out.println(" _________     ");
                System.out.println("|         |    ");
                System.out.println("|         0    ");
                System.out.println("|        /|\\  ");
                System.out.println("|        / \\  ");
                System.out.println("|");
                System.out.println("|");
               // System.out.println("");
                break;
            default:
                System.out.println("ERROR DRAWING!");
                        break;
                
                
                
                
                
                
                
                
        }
    }
    
}

