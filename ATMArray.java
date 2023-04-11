import java.util.Scanner;
/* getAthentication() // get pin and account number and verify
    displayMainMenu()
    display withdrawalamt()
*/
public class ATMArray{
    public static void main(String [] args){
        Scanner myScan = new Scanner(System.in);
        int [] accountNumber = {99999,88888,77777,66666,55555};
        int [] pin = {1216,1091,4822,2350,7385};
        double [] totalBalance = {1000,250,500,800,900};
        int deposit;
        int choice;
        int userAcct;
        int userPin;
        double input;
        int indexArray;
        boolean found = false;
        final int BALANCE_INQUIRY = 1;
        final int WITHDRAWAL = 2;
        final int DEPOSIT = 3;
        final int EXIT = 4;
        System.out.println("Enter your account number");
        userAcct = ATMMethods.getInteger(myScan);
        indexArray = 0;
        for (indexArray = 0; indexArray < accountNumber.length; indexArray++){
            if(userAcct == accountNumber[indexArray]){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("You entered an invalid acccountNumber");
        }
        else{
            System.out.println("Enter pin");
            userPin = ATMMethods.getInteger(myScan);
            if (userPin != pin[indexArray]){
                System.out.println("You entered an invalid pin");
            }
            else{
            do{
                System.out.println("\nMain menu:");
                System.out.println("1 - View my balance");
                System.out.println("2 - Withdraw Cash");
                System.out.println("3 - Deposit funds");
                System.out.println("4 - Exit\n");
                System.out.println("Enter your choice");
                choice = ATMMethods.getInteger(myScan);
                switch (choice){
                    case BALANCE_INQUIRY: 
                       System.out.println("\nBalance Information:");
                       System.out.println("  -  Total balance: ");
                       System.out.println(totalBalance[indexArray]);
                       break;
                    case WITHDRAWAL: 
                            System.out.println("Enter your withdrawal amount");
                            input = ATMMethods.getDouble(myScan);
                                  if (totalBalance[indexArray] > input){
                                      totalBalance[indexArray] = totalBalance[indexArray] - input;
                                      System.out.println("Remove your money from machine");
                                      System.out.println("Total Balance " + totalBalance[indexArray]);
                                    }
                                  else 
                                      System.out.println("Insufficient Funds");
                            break;
                    case DEPOSIT:
                        System.out.println("Enter deposit amount");
                        deposit = ATMMethods.getInteger(myScan);
                        totalBalance[indexArray] = totalBalance[indexArray] + deposit;
                        System.out.println("Place you envelope in machine");
                        System.out.println("Total Balance " + totalBalance[indexArray]);
                    break;
                    case EXIT:
                        System.out.println("Have a nice Day");
                        break;
                    default:
                        System.out.println("Invalid Value Entered");
            }

        }
            while(choice != EXIT);
            
    }
    }
}

}
