import java.util.Scanner;

public class PhoneNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ///this part asks for a phone number
    System.out.print("Enter a 10 digit phone number: ");
    long phoneNumber = in.nextLong();
    in.close();

    /// These three lines seperate the 3 parts of the phone number
    int areaCode = (int) (phoneNumber / 10000000);
    int prefix = (int) (phoneNumber % 10000000 / 10000);
    int lineNumber = (int) (phoneNumber % 10000);
    // outputs 
    System.out.println("\nFormatted phone number: (" + areaCode + ") " + prefix + "-" + lineNumber);
  }
}
