/* CSE 007 
Classwork : Loops
Dong Hyuk Shin */

import java.util.Scanner; 

public class Average{
    public static void main(String[] args){
        System.out.println("Enter 5 values");
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while (i< 6){
            System.out.println("Enter value " + i);
             if(scan.hasNextInt()) {
                sum += scan.nextInt();
                i++;
            } else {
                String junk = scan.next();
                System.out.println("Not an integer! Try again");
                scan.next();
            }
        }
    double average = (double) sum / 5.0;
    System.out.println("The Average of the 5 values is " + average);

    }
}