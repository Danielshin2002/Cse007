/* CSE 007 
Classwork : Loops
Dong Hyuk Shin */

import java.util.Scanner; 

public class Average2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int countNum = 0;
        //ask the user for how mnya numbers there are going to be
        System.out.println("How many number do you want to find the average for?");
             countNum = scan.nextInt();


        while (i< countNum){
            i++;
            System.out.println("Enter value " + i);
             if(scan.hasNextInt()) {
                sum += scan.nextInt();
            } else {
                String junk = scan.next();
                System.out.println("Not an integer! Try again");
                scan.next();
            }
        }
    double average = (double) sum / countNum;
    System.out.println("The Average of the "+ countNum + "values is " + average);

    }
}