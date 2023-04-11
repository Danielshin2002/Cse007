import java.util.Random;
import java.util.Scanner;

public class MethodsPractice{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        boolean play = true;
        Random rand = new Random();

        do{
            //TODO: create a variable called letter1 and assign it to the value returned by calling generateChar()
            char letter1 = MethodsPractice.generateChar(rand);
            System.out.println("Letter 1: "+ letter1);
            //TODO: create a variable called letter1 and assign it to the value returned by calling generateChar()
            char letter2 = MethodsPractice.generateChar(rand);
            System.out.println("Letter 2: "+ letter2);

            System.out.println("Which letter is bigger?"); //asking for user input about which character is the largest
            char ans = in.nextLine().charAt(0);
            //TODO: create a variable called max and assign it to the value returned by calling compareChars to compare letter1 and letter2
            char max = MethodsPractice.compareChars(letter1, letter2);
            //checking if user was correct
            if(ans == max){
                System.out.println("Correct!");
                System.out.println("Incorrect");
            }
            System.out.println("Play again? Y/N"); //asking user if they want to play again. only N will end loop/program
            char choice = in.nextLine().charAt(0);
            if(choice == 'N'){
                play = false;
            }
        } while(play);
    }

  public static char generateChar(Random rand){
        return (char) (rand.nextInt(26) + 65);
    }
    
    public static char compareChars(char char1, char char2){
        if(char1 > char2){
            return char1;
            } else { 
                return char2;
        }
    }
}

