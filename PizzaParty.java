import java.util.Scanner;

    public class PizzaParty {
        public static void main(String args[]){
            //variables will be declared here
            double budget;
            int numFriends;
            double avgSlicePerson;
            double costPerPizza;
            int wholePizza;
            double totalPizzaCost;
            double totalTaxOwed;
            double totalFriday;
            final int slicePerPizza = 8;
            final double salesTax = .06;
            final double deliveryFee = 4.99;


            Scanner scan = new Scanner(System.in);

            //user prompts here
             System.out.println("\nHow much do you have to spend?");
             double budget = scan.nextDouble();
             System.out.println("Enter the number of friends on Friday:");
             int numFriends = scan.nextInt();
             System.out.println("Enter the average slices eaten per person:");
             double avgSlicePerson = scan.nextDouble();
             System.out.println("Enter the cost per pizza:");
             double costPerPizza = scan.nextDouble();

            //how many pizzas do we need
            double slices = *(numFriends+1) * avgSlicePerson;
            double pizzas = slices / slicePerPizza;
            int wholePizza = (int) (Math.ceil(pizzas));

            //total pizza cost
            double totalPizzaCost = wholePizzas * costPerPizza;
            double totalTaxOwed = totalPizzaCost * salesTax;
            double totalFriday = totalPizzaCost + totalTaxOwed + deliveryFee;

            //Display Friday Night costs
            System.out.println("\nFriday Night Party");
            System.out.println(wholePizzas + " Pizzas: $" + String.format("%.2f", totalPizzaCost));
            System.out.println("Tax: $" + String.format("%.2f", totalTaxOwed));
            System.out.println("Delivery: $" + String.format("%.2f", deliveryFee));
            System.out.println("Total: $" + String.format("%.2f", totalFriday));
            
            // Getting user input for Saturday night
            System.out.println("\nEnter the number of friends on Saturday:");
            numFriends = scan.nextInt();
            System.out.println("Enter the average slices eaten per person:");
            avgSlicePerson = scan.nextDouble();
            System.out.println("Enter the cost per pizza:");
            costPerPizza = scan.nextDouble();

            //basically just the same calculations as last time
            //how many pizzas do we need
            double slices = *(numFriends+1) * avgSlicePerson;
            double pizzas = slices / slicePerPizza;
            int wholePizza = (int) (Math.ceil(pizzas));

            //total pizza cost
            double totalPizzaCost = wholePizzas * costPerPizza;
            double totalTaxOwed = totalPizzaCost * salesTax;
            double totalSaturday = totalPizzaCost + totalTaxOwed + deliveryFee;

            //Display Sat Night costs
            System.out.println("\nSat Night Party");
            System.out.println(wholePizzas + " Pizzas: $" + String.format("%.2f", totalPizzaCost));
            System.out.println("Tax: $" + String.format("%.2f", totalTaxOwed));
            System.out.println("Delivery: $" + String.format("%.2f", deliveryFee));
            System.out.println("Total: $" + String.format("%.2f", totalSaturday));

            double totalFridaySaturday = totalFriday + totalSaturday;
            System.out.println("Weekend Total : 6 Pizzas for "+ String.format("%.2f", totalFridaySaturday)"\nCan you Afford? False");
            
            

        }
    }