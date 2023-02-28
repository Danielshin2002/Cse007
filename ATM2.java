/*CSE 007 Spring 2023: Lab 1
    DongHyuk Shin Jan 27 
    I used VSCode and this is a program to compare ATM statemets*/
import java.util.Scanner;

public class ATM2 {
    public static void main (String[] args) {
        Scanner mySys = new Scanner(System.in);
        /*variables*/

        int menuOption = 0;
        int accountNumber = 00000;
        boolean activeAccount = true;
        double accountBalance = 123456;
        final int showBalance = 1;
        final int accountWithdrawal  = 2;
        final int accountDeposit = 3;
        final int exitMenu = 4;
        int depositAmount;
        int cashWithdrawal;
        int pinNumber = 1234;

        /*Print Statements and Scanner */
        System.out.println("Enter your account number:");
        accountNumber = mySys.nextInt();
        System.out.println("Enter your pin number:");
        pinNumber = mySys.nextInt();
        //compare to validate

        if (accountNumber != 00000) {
            //comparing account number
            System.out.println("Invalid Account Number. Try again");
        } else {
        if (pinNumber != 1234) {
            //comparing pin number 
            System.out.println("Your Pin Number is not Correct!");
        } else 
        System.out.println("Welcome to the Bank of America ATM System\nMain menu:\n1 - View my balance\n2 - Withdraw Cash\n3 - Deposit Funds\n4 - Exit\n Enter a choice");
        menuOption = mySys.nextInt(); 
        }
        //compare for valid option
        if (menuOption != 1 && menuOption != 2 && menuOption != 3 && menuOption != 4) {
            System.out.println("That choice is not valid, try again");
        } else {
        switch (menuOption) {
            case 1:
                System.out.println("Your account balance is: $"+ accountBalance);
            break;
            case 2:
                System.out.println("Enter your withdrawal amount");
                cashWithdrawal = mySys.nextInt();
                //compare if they hvae enough money to withdraw that amount
                if (cashWithdrawal > accountBalance) {
                    System.out.println("Insufficient Funds To Withdraw that amount. \n Please try again");
                } else {
                    System.out.println("\nPlease take your cash.");
                    accountBalance -= cashWithdrawal;
                }
            break;
            case 3:
                System.out.println("How much cash are you depositing?");
                depositAmount = mySys.nextInt();
                //compare if it is under the maximum/cash or check
                if (accountDeposit > 500) {
                    System.out.println("You must use check or teller to deposit more than $500 cash");
                } else {
                    System.out.println("Depostit complete!");
                    accountBalance += depositAmount;
                }
            case 4:
                System.out.println("Thank you for using the Bank of America ATM.");


        }}

       mySys.close();

    }}
