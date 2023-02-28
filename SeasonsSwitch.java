//Cse 007
//Dong Hyuk Shin
//Classwork : Selection Statements 1


import java.util.Scanner;

public class SeasonsSwitch {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        //ask for the date

        System.out.print("Enter a date (String, int): ");
        String month = in.next();
        int day = in.nextInt();
        in.close();

        boolean isValid = false;
        String season = "";

        //Check month to season using switch statements, no if/if-else/elseif functions
        //desired output is the same.
        switch (month) {
            case "March":
                season = day >= 20 ? "Spring" : "Winter";
                isValid = true;
                break;
            case "April":
            case "May":
                season = "Spring";
                isValid = true;
                break;
            case "June":
                season = day >= 21 ? "Summer" : "Spring";
                isValid = true;
                break;
            case "July":
            case "August":
                season = "Summer";
                isValid = true;
                break;
            case "September":
                season = day >= 22 ? "Autumn" : "Summer";
                isValid = true;
                break;
            case "October":
            case "November":
                season = "Autumn";
                isValid = true;
                break;
            case "December":
                season = day >= 21 ? "Winter" : "Autumn";
                isValid = true;
                break;
            case "January":
            case "February":
                season = "Winter";
                isValid = true;
                break;
            default:
                break;
        }

        if (isValid) {
            System.out.println(month + " " + day + " falls during " + season);
        } else {
            System.out.println("You entered an invalid date.");
 
        }
    }
}

