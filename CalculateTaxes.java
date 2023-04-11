/* Cse 007
Dong Hyuk Shin
Calculate Taxes *///

import java.util.Scanner;

public class CalculateTaxes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter annual wages: ");
        double wage = getDouble(scanner); //input validation for positive double value
        System.out.print("Enter taxable interest: ");
        double interest = getDouble(scanner); // again input validation for positive double value
        System.out.print("Enter unemployment compensation: ");
        double unemployComp = getDouble(scanner); // AGAIN input validation for positive double value
        System.out.print("Enter taxes withheld: ");
        double withheld = getDouble(scanner); // AND AGAIN input validation for positive double value we really love our doubles here
        System.out.print("Enter status (0=dependent, 1=single, 2=married): ");
        int status = getInt(scanner); //ok its int now, a positive int

        int agi = computeAGI(wage, interest, unemployComp);
        int deduction = getDeduction(status);
        int taxable = getTaxable(agi, deduction);
        int federalTax = calcTax(status, taxable);
        int taxDue = calcTaxDue(federalTax, (int) withheld);
        
        System.out.printf("AGI: $%,d\n", agi);
        System.out.printf("Deduction: $%,d\n", deduction);
        System.out.printf("Taxable income: $%,d\n", taxable);
        System.out.printf("Federal tax: $%,d\n", federalTax);
        System.out.printf("Tax due: $%,d\n", taxDue);



    }




// Invoke other methods here

//getDouble method should return positive double value, and can read wage, interest, unemployCompensation, and withheld
    public static double getDouble(Scanner scanner) {
        double value;
        while (true) {
            if (scanner.hasNextDouble()) { //input validation here, HAS to be a double
                value = scanner.nextDouble();
                scanner.nextLine();
                if (value >= 0) {
                    break;
                }
            }
            System.out.println("Invalid input. Please enter a valid positive double value");
            scanner.nextLine();
        }
        return value;
    }

//getINt returns non negative int, and can be invoked to represtn status in 0 1 or 2. needs input validation
    public static int getInt(Scanner scanner){
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value >= 0) {
                    break;
                }
            }
            System.out.println("Invalid input. Please enter a non-negative integer.");
            scanner.nextLine();
        }
        return value;
    }

//getAGI will be adjusted gross income, which is just sum of wage interest, and unemployment comp
public static int computeAGI(double wage, double interest, double unemployComp){
    return (int) Math.round(wage + interest + unemployComp); //this value is just sum of those, 
}

public static int getDeduction(int status){
    switch (status) {
        case 0:
             return 6000;
        case 1: 
            return 12000;
        case 2: 
            return 24000;
        default: 
            return 6000;
    }
}

public static int getTaxable(int agi, int deduction) {
    int taxable = agi - deduction;
    //if agi-deduction is <0, then set it to 9
    return Math.max(taxable,0);
}


public static int calcTax(int status, int taxableIncome) {
    double tax = 0;
//remember, 0 means dependetn, 1 is single, and 2 is married
        if (status == 0 || status == 1) {
            if (taxableIncome <= 10000) {
                tax = 0.1 * taxableIncome;
            } else if (taxableIncome <= 40000) {
                tax = 1000 + 0.12 * (taxableIncome - 10000);
            } else if (taxableIncome <= 85000) {
                tax = 4600 + 0.22 * (taxableIncome - 40000);
            } else {
                tax = 14500 + 0.24 * (taxableIncome - 85000);
            }
        } else if (status == 2) {
            if (taxableIncome <= 20000) {
                tax = 0.1 * taxableIncome;
            } else if (taxableIncome <= 80000) {
                tax = 2000 + 0.12 * (taxableIncome - 20000);
            } else {
                tax = 9200 +.22 * (taxableIncome - 80000);

}
} return (int) Math.round(tax);
}

public static int calcTaxDue(int federalTax, double withheld) {
    return (int) Math.round(federalTax - withheld);
}



}










