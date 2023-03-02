import java.util.Scanner;
import java.util.Random;

public class Exam1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int repeat = 0;
        boolean loopValue = false;
        int countdown = 0;
        double totalCount = 0;
        double averageCount = 0;
        double times = 0;
    // ask for how many times the user wants the program to repeat
       
        do {
           System.out.print("Enter a integer between 2 and 48 "); 
           if(input.hasNextInt()) {
            repeat =input.nextInt();
            times = times + repeat;
            if(repeat < 2 || repeat > 48){
                loopValue = true;
                System.out.println("Invalid Input");
            } else {
                loopValue = false;
            }
           } else {
            input.nextLine();
            loopValue = true;
            System.out.println("Invalid Input");
           }
        }   while(loopValue);
            while(repeat > 0){
                repeat--;
                int randomValue = (int) (Math.random() * 1000 - 0 + 110) + 0;
                System.out.println("The random number is " + randomValue);
                System.out.println();
                for(int i = 0; i < (randomValue % 111);){
                if(randomValue % 111 != 0){
                    System.out.print(randomValue + " ");
                    randomValue--;
                    countdown++;
                } else {
                    countdown = 0;
                } System.out.println("Number Count : " + countdown);
                }
                totalCount = totalCount + countdown;
                countdown = 0;

            }
                System.out.println("The Total Count is " + totalCount);
                averageCount = (double) (totalCount / times);
 
                System.out.println("The Average Count is : " + averageCount);









//Source: https://stackoverflow.com/questions/5887709





/// if(randomValue !=111 || randomValue != 222 || randomValue != 333 || randomValue != 444 || randomValue != 555 ||randomValue != 666 || randomValue != 777 || randomValue != 888 || randomValue != 999






    }
}






