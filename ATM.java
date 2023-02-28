/*CSE 007 Spring 2023: Lab 1
    DongHyuk Shin Jan 27 
    I used VSCode and this is a program to convert from kilgrams to pounds*/
import java.util.Scanner;

public class ATM {
    public static void main (String[] args) {
        Scanner mySys = new Scanner(System.in);
        /*variables*/

        byte menuOption;
        int accountNumber = 00000;
        boolean activeAccount = true;
        double accountBalance = 123456;
        final int showBalance = 1;
        final int accountWithdrawal  = 2;
        final int accountDeposit = 3;
        final int exitMenu = 4;
        int cashWithdrawal;
        int pinNumber = 1234;

        /*Print Statements and Scanner */
        System.out.println("Enter your account number:");
        accountNumber = mySys.nextInt();
        System.out.println("Enter your pin number:");
        pinNumber = mySys.nextInt();
        System.out.println("Enter your withdrawal amount");
        cashWithdrawal = mySys.nextInt();
        System.out.println("Welcome to the Bank of America ATM System\nMain menu:\n1 - View my balance\n2 - Withdraw Cash\n3 - Deposit Funds\n4 - Exit\n Enter a choice");
        menuOption = mySys.nextByte(); 

        System.out.println("Your acccount balance is: $" + accountBalance);
        
        System.out.println("\nPlease take your cash.");
        
        System.out.println("\nThank you for using the Bank of America ATM.");
        
        mySys.close();

    }
}