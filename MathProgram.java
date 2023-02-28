// Cse 007
// Dong Hyuk Shin
// Febrauary 14

import java.util.Scanner;

public class MathProgram {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Math Program");
        System.out.println("A. Maximum");
        System.out.println("B. Minimum");
        System.out.println("C. Mean");
        System.out.println("D. Variance");
        System.out.print("Enter your choice: ");
        String menuType = scan.nextLine();


    switch(menuType) {
        case "A" :
            System.out.print("Enter three numbers : ");
             int a = scan.nextInt();
             int b = scan.nextInt();
             int c = scan.nextInt();
            if(a <= 100 && a >= 0 && b<=100 && b >= 0 && c <= 100 && c>= 0) {
                int result = Math.max(a,Math.max(b,c));
                System.out.printf("The maximum of (%d, %d,%d) is : (%d)", a, b, c , result);
            } else {
                System.out.print("Error: Your numbers must be between 0 and 100");
                System.exit(0);
            } break;
        
        case "B" :
            System.out.print("Enter three numbers : ");
             a = scan.nextInt();
             b = scan.nextInt();
             c = scan.nextInt();
            if(a <= 100 && a >= 0 && b<=100 && b >= 0 && c <= 100 && c>= 0) {
                int result = Math.min(a,Math.min(b,c));
                System.out.printf("The minimum of (%d, %d,%d) is : (%d)", a, b, c , result);
            } else {
                System.out.print("Error: Your numbers must be between 0 and 100");
                System.exit(0);
            } break; 


        case "C" :
            System.out.print("Enter three numbers : ");
             a = scan.nextInt();
             b = scan.nextInt();
             c = scan.nextInt();
            if(a <= 100 && a >= 0 && b<=100 && b >= 0 && c <= 100 && c>= 0) {
                double result = (a+b+c) / 3.0;
                System.out.printf("The average of (%d, %d,%d) is : (%d)", a, b, c , result);
            } else {
                System.out.print("Error: Your numbers must be between 0 and 100");
                System.exit(0);
            } break;

        case "D" :
            System.out.print("Enter three numbers : ");
             a = scan.nextInt();
             b = scan.nextInt();
             c = scan.nextInt();
            if(a <= 100 && a >= 0 && b<=100 && b >= 0 && c <= 100 && c>= 0) {
                    double mean = (a + b + c) / 3.0;
                    double variance = ((a - mean)*(a - mean) + (b - mean)*(b - mean) + (c - mean)*(c - mean)) / 3.0;
                System.out.printf("The variance of (%d, %d,%d) is : (%d)", a, b, c , variance);
            } else {
                System.out.print("Error: Your numbers must be between 0 and 100");
                System.exit(0);
            } break;
        default: 
            System.out.println("Error : Invalid Menu Choice");
    }
}}