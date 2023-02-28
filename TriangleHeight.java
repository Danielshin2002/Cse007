/* cse challenge prob */

import java.util.Scanner;

public class TriangleHeight{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = input.next().charAt(0);
        int h;

            do{
            System.out.println("Enter triangle height");
            while (!input.hasNextInt()) {  //prompting for a valid number
                System.out.println("Invalid input. Please enter a positive integer");
                input.next();
            }
            h = input.nextInt();
            } while (h < 0);

            if (h < 0) {
                System.out.println(" ");
            } else {
            for (int i = 0; i<h; i++){
                for(int j =0; j<i+1; j++){
                    System.out.print(Character.toString(c));
                }
                System.out.println("\r");
            } 
            }

    }
}

