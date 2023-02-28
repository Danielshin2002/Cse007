import java.util.Scanner;

public class SphereRadius{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the volume of the sphere");
        double v = scnr.nextDouble();
        double radius = Math.cbrt(3 *v / (4 * Math.PI));
        /*Again, by using double here, we make sure that java actually divides and doesnt throw any remainders away */
        System.out.println("The radius of the sphere is: " + radius );

    }
}