/*Cse 007
Dong Hyuk Shin
Tribbonacci sequence*/

import java.util.Scanner;

public class GetTribonacci{
    public static void main(String [] args){
            Scanner input = new Scanner(System.in);
            int n;

            do{
            System.out.println("Please enter the n-th Tribbonaci number you want to check : ");
            while (!input.hasNextInt()) {  //prompting for a valid number
                System.out.println("Invalid input. Please enter a non negative integer");
                input.next();
            }
            n = input.nextInt();
            } while(n < 0);

            if (n==0) {
                System.out.println("Sequence : 0");
                System.out.println("The Tribonacci number for n=0 is 0");
            } else {
                int[] sequence = new int[n+1];
                sequence[0] = 0;
                if (n > 0) {
                    sequence [1] = 1;
                } 
                if (n > 1 ) {
                    sequence[2] = 1;
                } // this was the first three tribonacci numbers
                for (int i = 3; i <= n; i++) {
                    sequence [i] = sequence[i - 1] + sequence [i - 2] + sequence [i - 3];
                }
                System.out.print("Sequence : ");
                for (int i = 0; i <= n; i++) {
                    System.out.print(sequence[i] + " ");
                }
                System.out.println("The " + n+ "'th Tribonacci Number is " + sequence[n]);
            }




    }
}