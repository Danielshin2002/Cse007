import java.util.Scanner;

public class SeasonsIf {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        //ask for the date

        System.out.print("Enter a date (String, int): ");
        String month = in.next();
        int day = in.nextInt();
        in.close();

        boolean isValid = false;
    
        //Check month to season
        if (month.equals("March")) {
            if (day >= 20 && day <= 31) {
                System.out.println(month + " " + day + " falls during Spring");
                isValid = true;
            } else if (day >= 1 && day <= 19) {
                System.out.println(month + " " + day + " falls during Winter");
                isValid = true;
            }
        } else if (month.equals("April") || month.equals("May")) {
            if (day >= 1 && day <= 31) {
                System.out.println(month + " " + day + " falls during Spring");
                isValid = true;
            }
        } else if (month.equals("June")) {
            if (day >= 1 && day <= 20) {
                System.out.println(month + " " + day + " falls during Spring");
                isValid = true;
            } else if (day >= 21 && day <= 30) {
                System.out.println(month + " " + day + " falls during Summer");
                isValid = true;
            }
        } else if (month.equals("July") || month.equals("August") || month.equals("September")) {
            if (day >= 1 && day <= 31) {
                System.out.println(month + " " + day + " falls during Summer");
                isValid = true;
            }
        } else if (month.equals("September")) {
            if (day >= 22 && day <= 30) {
                System.out.println(month + " " + day + " falls during Autumn");
                isValid = true;
            }
        } else if (month.equals("October") || month.equals("November") || month.equals("December")) {
            if (day >= 1 && day <= 31) {
                System.out.println(month + " " + day + " falls during Autumn");
                isValid = true;
            }
        } else if (month.equals("December")) {
            if (day >= 21 && day <= 31) {
                System.out.println(month + " " + day + " falls during Winter");
                isValid = true;
            }
        } else if (month.equals("January") || month.equals("February")) {
            if (day >= 1 && day <= 28) {
                System.out.println(month + " " + day + " falls during Winter");
                isValid = true;
            }
        }
        if(!isValid) {
            System.out.println("You entered an invalid date / date format");
        }
    }
}

