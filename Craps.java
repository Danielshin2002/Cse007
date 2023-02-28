/*Cse 007
Dong Hyuk Shin
Craps*/

import java.util.Scanner;

public class Craps{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean play = true;
        int gamesPlayed = 0;
        int roll;



        System.out.println("Welcome to the game Craps");

        while (play) {
            gamesPlayed++;
                    int roll1 = (int) (Math.random() * (6 - 0 + 1)) + 0;
                    int roll2 = (int) (Math.random() * (6 - 0 + 1)) + 0;
                    



        switch (roll1) {
            case 1:
                if (roll2 == 1){
                System.out.println("Snake Eyes!");
            } else if (roll2 == 2) {
                System.out.println("Ace Deuce");
            } else if (roll2 == 3) {
                System.out.println("Easy Four");
            } else if (roll2 == 4) {
                System.out.println("Fever Five");
            } else if (roll2 == 5) {
                System.out.println("Easy Six");
            } else if (roll2 == 6) {
                System.out.println("Seven out");
            } break;
            case 2:
                if (roll2 == 1){
                System.out.println("Ace Deuce");
            } else if (roll2 == 2) {
                System.out.println("Hard Four");
            } else if (roll2 == 3) {
                System.out.println("Fever Five");
            } else if (roll2 == 4) {
                System.out.println("Easy six ");
            } else if (roll2 == 5) {
                System.out.println("Seven out");
            } else if (roll2 == 6) {
                System.out.println("Easy Eight");
            } break;
            case 3:
                if (roll2 == 1){
                System.out.println("Easy four");
            } else if (roll2 == 2) {
                System.out.println("Fever Five");
            } else if (roll2 == 3) {
                System.out.println("Hard Six");
            } else if (roll2 == 4) {
                System.out.println("Seven out");
            } else if (roll2 == 5) {
                System.out.println("Easy Eight");
            } else if (roll2 == 6) {
                System.out.println("Nine");
            } break;
            case 4:
                if (roll2 == 1){
                System.out.println("Fever Five");
            } else if (roll2 == 2) {
                System.out.println("Easy Six");
            } else if (roll2 == 3) {
                System.out.println("Seven out");
            } else if (roll2 == 4) {
                System.out.println("Hard Eight");
            } else if (roll2 == 5) {
                System.out.println("Nine");
            } else if (roll2 == 6) {
                System.out.println("Easy Ten");
            } break;
            case 5:
                if (roll2 == 1){
                System.out.println("Easy six");
            } else if (roll2 == 2) {
                System.out.println("Seven out");
            } else if (roll2 == 3) {
                System.out.println("Easy Eight");
            } else if (roll2 == 4) {
                System.out.println("Nine");
            } else if (roll2 == 5) {
                System.out.println("Hard Ten");
            } else if (roll2 == 6) {
                System.out.println("Yo-leven");
            } break;
            case 6:
                if (roll2 == 1){
                System.out.println("Seven out");
            } else if (roll2 == 2) {
                System.out.println("Easy Eight");
            } else if (roll2 == 3) {
                System.out.println("Nine");
            } else if (roll2 == 4) {
                System.out.println("Easy Ten");
            } else if (roll2 == 5) {
                System.out.println("Yo-leven");
            } else if (roll2 == 6) {
                System.out.println("Boxcards");
            } break;
        }
        boolean retry = false;
        while (!retry) {
            System.out.print("You rolled a " + roll1 +" and a " + roll2 +". \nYou've played Craps " + gamesPlayed+ " times. Would you like to play again? (Y/N): ");
            String answer = input.next().toUpperCase();
            if (answer.equals("Y")){
                play = true;
                retry = true;
            } else if (answer.equals("N")) {
                play = false;
                retry = true;
            } else {
                System.out.print("Invalid Input. PLease enter Y or N");
            }
        }
        }




    }
}