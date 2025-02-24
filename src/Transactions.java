import java.util.Scanner;

public class Transactions {
    private static final double QUARTER_VALUE = 0.25;
    private static final double DIME_VALUE = 0.10;
    private static final double NICKEL_VALUE = 0.05;
    private static final double CENT_VALUE = 0.01;

    private double money;
    private final Coffee coffee;
    private final Resources resources;

    public Transactions(Coffee coffee, Resources resources) {
        this.coffee = coffee;
        this.resources = resources;
    }

    public boolean processTransaction(Scanner scanner) {
        collectMoney(scanner);
        return handlePayment();
    }

    private void collectMoney(Scanner scanner) {
        System.out.print("How many quarters? : ");
        money += scanner.nextInt() * QUARTER_VALUE;

        System.out.print("How many dimes? : ");
        money += scanner.nextInt() * DIME_VALUE;

        System.out.print("How many nickels? : ");
        money += scanner.nextInt() * NICKEL_VALUE;

        System.out.print("How many cents? : ");
        money += scanner.nextInt() * CENT_VALUE;
    }

    private boolean handlePayment() {
        if (money > coffee.getMoneyNeeded()) {
            double change = money - coffee.getMoneyNeeded();
            System.out.printf("Here is your change: $%.2f%n", change);
            return true;
        } else if (money < coffee.getMoneyNeeded()) {
            System.out.println("Insufficient money, initiating refund...");
            return false;
        }
        System.out.println("Processing transaction... Transaction Successful");
        return true;
    }

    public boolean checkResources() {
        if (resources.getWater() < coffee.getWaterNeeded()) {
            System.out.println("Insufficient water");
            return false;
        }
        if (resources.getMilk() < coffee.getMilkNeeded()) {
            System.out.println("Insufficient milk");
            return false;
        }
        if (resources.getCoffee() < coffee.getCoffeeNeeded()) {
            System.out.println("Insufficient coffee");
            return false;
        }
        return true;
    }

    public void makeCoffee() {
        resources.updateResources(
                -coffee.getWaterNeeded(),
                -coffee.getMilkNeeded(),
                -coffee.getCoffeeNeeded(),
                coffee.getMoneyNeeded()
        );
    }
}