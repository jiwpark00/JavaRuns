package machine;

import java.util.Scanner;
import java.lang.Math;

public class CoffeeMachine {
    public static void main(String[] args) {
        // First Stage
        // System.out.println("Hello World!");
        // String coffeeText = """
        //     Starting to make a coffee
        //     Grinding coffee beans
        // Boiling water
        // Mixing boiled water with crushed coffee beans
        // Pouring coffee into the cup
        // Pouring some milk into the cup
        // Coffee is ready!
        //     """;
        // System.out.println(coffeeText);
        Scanner scanner = new Scanner(System.in);

        // Second Stage
        // System.out.println("Write how many cups of coffee you will need:");
        // int coffeeNeeds = scanner.nextInt();
        
        // System.out.printf("For %d cups of coffee you will need:\n", coffeeNeeds);
        // System.out.printf("%d ml of water\n", 200*coffeeNeeds);
        // System.out.printf("%d ml of milk\n", 50*coffeeNeeds);
        // System.out.printf("%d g of coffee beans\n", 15*coffeeNeeds);

        // Third Stage

        System.out.println("Write how many ml of water the coffee machine has:");
        int availWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int availMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int availBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int neededCoffee = scanner.nextInt();

        int maxPossibleCoffee = Math.min(availWater / 200, Math.min(availMilk / 50, availBeans / 15));
        
        if (maxPossibleCoffee < neededCoffee) {
            System.out.printf("No, I can make only %d cup(s) of coffee\n", maxPossibleCoffee);
        }
        else if (maxPossibleCoffee == neededCoffee) {
            System.out.printf("Yes, I can make that amount of coffee");
        }
        else {
            int remainCoffee = maxPossibleCoffee - neededCoffee;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", remainCoffee);
        }
    }
}
