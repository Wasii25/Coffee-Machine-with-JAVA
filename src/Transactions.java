import java.util.*;

public class Transactions {
    private double money;
    private final Coffee coffee;

    public Transactions(Coffee coffee) {
        this.coffee = coffee;
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

    public double getMoney() {
        return money;
    }

}
