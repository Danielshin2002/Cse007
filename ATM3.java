import java.util.Scanner;

public class ATM3{
    public static void main(String [] args){
        Scanner myScan = new Scanner(System.in);
        int accountNumber = 99999;
        int pin = 1216;
        double totalBalance = 1000;
        int choice = 0;
        int deposit = 0;
        int userAcct = 0;
        int userPin = 0;
        int input = 0;
        final int BALANCE_INQUIRY = 1;
        final int WITHDRAWAL = 2;
        final int DEPOSIT = 3;
        final int EXIT = 4;
        boolean validAcct = true;
        boolean validPin = true;
        boolean validInput = true;
        do{
           System.out.println("Enter your account number");
           if(myScan.hasNextInt() == true){
                userAcct = myScan.nextInt();
                validAcct = true;
           }
           else{
             System.out.println("You did not enter an integer");
             validAcct = false;
             myScan.nextLine();
           }
        }while(validAcct == false);
            
        if (userAcct != accountNumber){
            System.out.println("You entered an invalid acccountNumber");
        }
        else{
          myScan.nextLine();
          do{
            System.out.println("Enter pin");
            if(myScan.hasNextInt() == true){
               userPin = myScan.nextInt();
               validPin = true;
            }
            else{
                System.out.println("You did not enter an integer");
                validPin = false;
                myScan.nextLine();
            }
        }while(validPin == false);
        if (userPin != pin){
                System.out.println("You entered an invalid pin");
            }
            else{
            do{
              myScan.nextLine();
              do{
                System.out.println("\nMain menu:");
                System.out.println("1 - View my balance");
                System.out.println("2 - Withdraw Cash");
                System.out.println("3 - Deposit funds");
                System.out.println("4 - Exit\n");
                System.out.println("Enter a choice");
                    if(myScan.hasNextInt() == true){
                        choice = myScan.nextInt();
                        validInput = true;
                    }
                    else{
                        validInput = false;
                        myScan.nextLine();
                        System.out.println("You did not enter an integer");
                    }
                }while(validInput == false);
                switch (choice){
                    case BALANCE_INQUIRY: 
                       System.out.println("\nBalance Information:");
                       System.out.println("  -  Total balance: ");
                       System.out.println(totalBalance);
                       break;
                    case WITHDRAWAL: 
                            myScan.nextLine();
                            do{
                                System.out.println("Enter your withdrawal amount");
                                if(myScan.hasNextInt() == true){
                                    input = myScan.nextInt();
                                    validInput = true;
                                }
                                else{
                                    System.out.println("You did not enter an integer");
                                    validInput = false;
                                    myScan.nextLine();
                                }
                            }while(validInput == false);
                                  if (totalBalance > input){
                                      totalBalance = totalBalance - input;
                                      System.out.println("Remove your money from machine");
                                      System.out.println("Total Balance " + totalBalance);
                                    }
                                 else 
                                      System.out.println("Insufficent Funds");
                                break;
                    case DEPOSIT:
                        myScan.nextLine();
                        do{
                            System.out.println("Enter deposit amount");
                            if(myScan.hasNextInt() == true){
                                deposit = myScan.nextInt();
                                validInput = true;
                            }
                            else{
                                System.out.println("You did not enter an integer");
                                validInput = false;
                                myScan.nextLine();
                            }
                        }while(validInput == false);
                        totalBalance = totalBalance + deposit;
                        System.out.println("Place you envelope in machine");
                        System.out.println("Total Balance " + totalBalance);
                    break;
                    case EXIT:
                        System.out.println("Have a nice Day");
                        break;
                    default:
                        System.out.println("Invalid Value Entered");
            }
        }while(choice != EXIT);

        }
            
            
        }
    }
}