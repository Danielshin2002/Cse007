import java.util.Scanner;

public class SphereVolume{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere");
        double r = scnr.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(r,3);
        /*Java does integer division, meaning that it throws away the remainer, by using double java doesnt throw it away */
        System.out.println("The volume of the sphere is: " + volume);

    }
}