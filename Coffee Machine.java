package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
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
        System.out.println("Write how many cups of coffee you will need:");
        int coffeeNeeds = scanner.nextInt();
        
        System.out.printf("For %d cups of coffee you will need:\n", coffeeNeeds);
        System.out.printf("%d ml of water\n", 200*coffeeNeeds);
        System.out.printf("%d ml of milk\n", 50*coffeeNeeds);
        System.out.printf("%d g of coffee beans\n", 15*coffeeNeeds);
    }
}
