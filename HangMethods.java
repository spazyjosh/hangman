//*
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
    WordSelector help = new WordSelector();
    public void hangHim()
    {
        int selector=0;
         float helper = ((float)Hangman.wrongCounter/(float)Hangman.chances)*6f;
         
         selector = Math.round(helper);
        
         if (selector == 6 && Hangman.chances != Hangman.wrongCounter)
             selector = 5;
        
         
        switch(selector)
        {
            case 0:
  System.out.println("   _________");
  System.out.println("  |         |");
  System.out.println("  |");         
  System.out.println("  |");        
  System.out.println("  |");          
  System.out.println("  |");
  System.out.println("__|__");
                
                break;
            case 1:
  System.out.println("   _________");
  System.out.println("  |         |");
  System.out.println("  |         0");         
  System.out.println("  |");        
  System.out.println("  |");          
  System.out.println("  |");
 System.out.println("__|__");
               // System.out.println("");
                break;
            case 2:
  System.out.println("   _________");
  System.out.println("  |         |");
  System.out.println("  |         O");         
  System.out.println("  |         |");        
  System.out.println("  |");          
  System.out.println("  |");
System.out.println("__|__");
              //  System.out.println("");
                break;
            case 3:
  System.out.println("   _________");
  System.out.println("  |         |");
  System.out.println("  |         O");         
  System.out.println("  |         |\\");        
  System.out.println("  |");          
  System.out.println("  |");
System.out.println("__|__");
                break;
            case 4:
  System.out.println("   _________");
  System.out.println("  |         |");
  System.out.println("  |         O");         
  System.out.println("  |        /|\\");        
  System.out.println("  |");          
  System.out.println("  |");
System.out.println("__|__");
                break;
            case 5:
  System.out.println("   _________");
  System.out.println("  |         |");
  System.out.println("  |         O");         
  System.out.println("  |        /|\\");        
  System.out.println("  |        /");          
  System.out.println("  |");
System.out.println("__|__");
             //   System.out.println("");
                
                break;
            case 6:
                
  System.out.println("   __________");
  System.out.println("  |         |");
  System.out.println("  |         O");         
  System.out.println("  |        /|\\");        
  System.out.println("  |        / \\");          
  System.out.println("  |");
System.out.println("__|__");
             //   System.out.println("");
                break;
            default:
                System.out.println("ERROR DRAWING!");
                        break;
                
                
                
                
                
                
                
                
        }
    }
    
}
