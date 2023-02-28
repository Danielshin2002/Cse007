/* Cse 007
Dong Hyuk Shin
This is Lab4: Checking Palindromes*/

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number or a phrase to check if it is a palindrome");
    String phrase = input.nextLine();

    if (isInteger(phrase)) {
        int num = Integer.parseInt(phrase);
        //validatre that the number is within 11 to 1000000
        if (num >= 11 && num <= 1000000) { 
            if(isPalindrome(num)) {
                System.out.println("int " + num + "is a palindrome");
            } else {
                System.out.println("int " + num + "isn't a palindrome");
            }
        } else {
                System.out.println("Please enter an integer between 11 and 1000000 if you're entering an integer");
            }
    } else {
            if(isPalindrome(phrase)) {
            System.out.println("string " + phrase + " is a palindrome");
            } else {
                System.out.println("string " + phrase + " isn't palindrome");
            }
        }
    } 

    public static boolean isInteger(String phrase) {
        try {
            Integer.parseInt(phrase);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //palindrome check for int
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        //basicaly divide it into all of its 1, 10s, 100s, etc
        while (num !=0) {
            //take the remainder in order to split it up
            int digit = num % 10;
            //check to make usre it is palindromic, by pairing it up with opposite value
            reversed = reversed *10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    //pa
    public static boolean isPalindrome(String phrase) {
        phrase = phrase.replaceAll("\\s", ""); //get rid of any spaces within the phrase to check
        phrase = phrase.toLowerCase(); //make it lowercase so its not case sensitive
        int phraseLength = phrase.length();
        for (int i = 0; i < phraseLength / 2; i++) {
            if(phrase.charAt(i) != phrase.charAt(phraseLength -i - 1)) {
                return false;
            }
        }
        return true;
    }
}