//This class takes care of the transactions, and also making the coffee

import java.util.*;

public class Transactions {
    private double money;
    private final Coffee coffee;
    private Resources resources;

    public Transactions(Coffee coffee, Resources resources) {
        this.coffee = coffee;
        this.resources = resources;
    }

    public double getMoney() {
        return money;
    }

    public void transaction(Scanner sc) {
        inputTransaction(sc);
        if(this.getMoney() > coffee.getMoneyNeeded()) {
            System.out.println("Here is your change: $" + (this.getMoney() - coffee.getMoneyNeeded()));
        } else if (this.getMoney() < coffee.getMoneyNeeded() ) {
            System.out.println("Insufficient money, initiating refund . . .");
        } else {
            System.out.println("Processing transaction . . . Transaction Successful");
        }
    }

    public void inputTransaction(Scanner sc) {
        System.out.print("How many quarters? : ");
        int quart = sc.nextInt();
        this.money += quart*0.25;

        System.out.print("How many dimes? : ");
        int dimes = sc.nextInt();
        this.money += dimes*0.10;

        System.out.print("How many nickels? : ");
        int nickel = sc.nextInt();
        this.money += nickel*0.05;

        System.out.print("How many cents? : ");
        int cents = sc.nextInt();
        this.money += cents*0.01;

    }


    public boolean checkResources() {
        if (resources.getWater() < coffee.getWaterNeeded()) {
            System.out.println("----------------------------");
            System.out.println("Insufficient water");
            return false;
        }
        else if (resources.getMilk() < coffee.getMilkNeeded()) {
            System.out.println("Insufficient milk");
            return false;
        }
        else if (resources.getCoffee() < coffee.getCoffeeNeeded()) {
            System.out.println("Insufficient coffee");
            return false;
        }
        return true;
    }

    public void makeCoffee() {
        if (!checkResources()) {
            System.out.println("Sorry, we are out of service");
            System.out.println("----------------------------");

        } else {
            resources.setWater(resources.getWater() - coffee.getWaterNeeded());
            resources.setCoffee(resources.getCoffee() - coffee.getCoffeeNeeded());
            resources.setMilk(resources.getMilk() - coffee.getMilkNeeded());
            resources.setMoney(resources.getMoney() + coffee.getMoneyNeeded());
        }
    }

}
