//Cse 007 Java Spring 2023 :
//Dong Hyuk Shin
//February 14
//1. Numbering systems/representations are a way to represent values. 
//There are multiple types of numbering systems, the most common being the decimal number systems for us humans, and the binary, octal, and hexadedimal system for computers.
// Binary is an important numbering system because its 0s and 1s can be interpreted as false and true statements
// Two numbering systems other than binary are hexadecimal which can be used for color codes, and decimal system, which is what we use (think the metric system)
//THe biggest value that an integer variable can hoild is the 2^64 - 1. This number 2,147,483,6470. THe binary value of that same number is 1 (64 times)

import java.util.Scanner;

public class NumberConversion {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What kind of number do you want converted? Your choices are hex, octal, or binary");
        String type = scanner.nextLine();

        switch (type) {
            case "hex":
            System.out.print("Enter a 2 digit hexadecimal value");
            String hexValue = scanner.nextLine();
            int decimalValue = Integer.parseInt(hexValue, 16);  //i was not sure how to do this without using integer function WHILE not using a loop....
            System.out.printf("The converted value in decimal terms is : ", decimalValue, hexValue);
            break;

            case "octal":
            System.out.print("Enter a 3 digit octal value ");
            String octalValue = scanner.nextLine();
            decimalValue = Integer.parseInt(octalValue, 8);
            System.out.printf("The converted value in decimal terms is : ", decimalValue);
            break;

            case "binary":
            System.out.print("Enter a 4 bit binary value");
            String binValue = scanner.nextLine();
            decimalValue = Integer.parseInt(binValue, 16);
            System.out.printf("The converted value in decimal terms is : ", decimalValue);
            break;

            default:
                System.out.println("That is not a valid choice");
        }

    }
}