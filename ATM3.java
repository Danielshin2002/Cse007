import java.util.Scanner;

public class ATM3 {
    public static void main (String[] args) {
        Scanner mySys = new Scanner(System.in);
        /*variables*/

        int menuOption = 0;
        int accountNumber = 12345;
        boolean activeAccount = true;
        double accountBalance = 123456;
        final int showBalance = 1;
        final int accountWithdrawal  = 2;
        final int accountDeposit = 3;
        final int exitMenu = 4;
        int depositAmount;
        int cashWithdrawal;
        int pinNumber = 1234;
        int i = 0;
        int a = 0;
        boolean valid = false;
        boolean validPin = false;


        while (i < 5 && !valid) {
            i++;
            //comparing account number
            System.out.println("Enter your account number");
            if(mySys.hasNextInt()){
                accountNumber = mySys.nextInt();
                if (accountNumber != 12345) {
                    System.out.println("Invalid Account Number. Try again");
                } else {
                    valid = true;
                }
            }

        } 

        while (a < 4 && !validPin) {
            a++;
            //comparing pin number
            System.out.println("Enter your pin number");
            if(mySys.hasNextInt()){
                pinNumber = mySys.nextInt();
                if (pinNumber != 1234) {
                    System.out.println("Invalid Pin Number. Try again");
                } else {
                    validPin = true;
                }
            }

        } 

         
        System.out.println("Welcome to the Bank of America ATM System\nMain menu:\n1 - View my balance\n2 - Withdraw Cash\n3 - Deposit Funds\n4 - Exit\n Enter a choice");
        menuOption = mySys.nextInt(); 
        
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
                    //compare if they have enough money to withdraw that amount
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
                    if (depositAmount > 500) {
                        System.out.println("You must use check or teller to deposit more than $500 cash");
                    } else {
                        System.out.println("Deposit complete!");
                        accountBalance += depositAmount;
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank of America ATM.");
                    break;

            }
        }

       mySys.close();

    }
}
