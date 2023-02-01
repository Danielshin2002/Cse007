/* CSE 007 Spring 2023: Lab 1
    DongHyuk Shin Jan 27 
    I used VSCode and this is a program to convert from kilgrams to pounds*/

public class ConvertWeight{

    public static void main(String[]arg){
        final double kgPerPound = 0.45359237;
        double weightInPounds = 150.32;
        double weightInKilograms;

        weightInKilograms = kgPerPound*weightInPounds;
        
        System.out.println(weightInPounds+" is equivalent to "+ weightInKilograms+"kg");
    }
}