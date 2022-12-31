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

        // System.out.println("Write how many ml of water the coffee machine has:");
        // int availWater = scanner.nextInt();
        // System.out.println("Write how many ml of milk the coffee machine has:");
        // int availMilk = scanner.nextInt();
        // System.out.println("Write how many grams of coffee beans the coffee machine has:");
        // int availBeans = scanner.nextInt();

        // System.out.println("Write how many cups of coffee you will need:");
        // int neededCoffee = scanner.nextInt();

        // int maxPossibleCoffee = Math.min(availWater / 200, Math.min(availMilk / 50, availBeans / 15));
        
        // if (maxPossibleCoffee < neededCoffee) {
        //     System.out.printf("No, I can make only %d cup(s) of coffee\n", maxPossibleCoffee);
        // }
        // else if (maxPossibleCoffee == neededCoffee) {
        //     System.out.printf("Yes, I can make that amount of coffee");
        // }
        // else {
        //     int remainCoffee = maxPossibleCoffee - neededCoffee;
        //     System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", remainCoffee);
        // }

        // Fourth Stage
        System.out.println("The coffee machine has:");
        System.out.println("400 ml of water");
        System.out.println("540 ml of milk");
        System.out.println("120 g of coffee beans");
        System.out.println("""
                           9 disposable cups
                           $550 of money""");

        System.out.println("");
        System.out.println("Write action (buy, fill, take):");
        String userAction = scanner.nextLine();
        if (userAction.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int userBuyChoice = scanner.nextInt();
            switch (userBuyChoice) {
                case 1:
                    System.out.println("");
                    System.out.println("""
                        The coffee machine has:
                        150 ml of water
                        540 ml of milk
                        104 g of coffee beans
                        8 disposable cups
                        $554 of money
                        """);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("""
                        The coffee machine has:
                        50 ml of water
                        465 ml of milk
                        100 g of coffee beans
                        8 disposable cups
                        $557 of money
                        """);
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("""
                        The coffee machine has:
                        200 ml of water
                        440 ml of milk
                        108 g of coffee beans
                        8 disposable cups
                        $556 of money
                        """);
                    break;
                    
            }
        }
        else if (userAction.equals("take")) {
            System.out.println("I gave you $550");
            System.out.println("");
            System.out.println("""
                The coffee machine has:
                400 ml of water
                540 ml of milk
                120 g of coffee beans
                9 disposable cups
                $0 of money
                              """);
            
        }
        else {
            System.out.println("");
            System.out.println("Write how many ml of water you want to add:");
            int addWater = scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add:");
            int addMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add:");
            int addBeans = scanner.nextInt();
            System.out.println("Write how many disposable cups you want to add:");
            int addCups = scanner.nextInt();

            System.out.printf("""
                The coffee machine has:\n
                %d ml of water\n
                %d ml of milk\n
                %d g of coffee beans\n
                %d disposable cups\n
                $550 of money
                              """,400+addWater,540+addMilk,120+addBeans,9+addCups);
        }
        
        
    }
}
