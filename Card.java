/*CSE 007 Spring 2023: Lab 1
    DongHyuk Shin Jan 27 
    Code analysis and Exam preparation*/

import java.util.Scanner;

public class Card  {
    public static void main(String [] args) {
    int cardNumber = (int) (Math.random() * (51 - 0 + 1)) + 0;


    String suitName = "a"; 
    String cardFace;


    //determine which type of card it is (suit)
    switch(cardNumber / 13) { //you can get 0, 1, 2, 3 because no remainder)
        case 0:
            suitName = "Diamonds";
            break;
        case 1:
            suitName = "Clubs";
            break;
        case 2:
            suitName = "Hearts";
            break;
        case 3: 
            suitName = "Spades";
            break;
    }


    //determine if its a face number
    switch (cardNumber % 13){ //this works by finding the remainder. for example, 13 would be ace beacuse it has 0 remainder.
        case 0:
            cardFace = "Ace";
            break;
        case 10:
            cardFace = "Jack";
            break;
        case 11:
            cardFace = "Queen";
            break;
        case 12:
            cardFace = "King";
            break;
        default: 
            cardFace = Integer.toString((cardNumber % 13) + 1); // we need +1 here because if the card face is 1, you'd get 1, but the first number after Ace is 2.

    }



    System.out.println("Random Number: " + cardNumber + "; You picked the " + cardFace + " of " + suitName);

    }
}