import java.util.Scanner;

public class Test {
    public static void main(String[] args){

    //Variables and constant + conversion from celsius to fahrenheit, given celsius
    final int Cel_To_Fahrenheit = 32;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter the temp in degrees CELSIUS");
    double celsius = scnr.nextDouble();
    double fahrenheit = 9.0 / 5.0 * celsius + Cel_To_Fahrenheit;
    System.out.println("Fahrenheit = " + fahrenheit + " degrees,   Celsius = " + celsius + " degrees");
}}



