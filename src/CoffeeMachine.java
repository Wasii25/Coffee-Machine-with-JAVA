import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
    private final Map<Integer, Coffee> menu;
    private final Resources resources;
    private final Scanner scanner;

    public CoffeeMachine() {
        this.scanner = new Scanner(System.in);
        this.resources = new Resources(300, 200, 100);
        this.menu = initializeMenu();
    }

    private Map<Integer, Coffee> initializeMenu() {
        Map<Integer, Coffee> menu = new HashMap<>();
        menu.put(1, new Coffee("Espresso", 50, 0, 18, 1.50));
        menu.put(2, new Coffee("Latte", 200, 150, 24, 2.50));
        menu.put(3, new Coffee("Cappuccino", 250, 100, 24, 3.00));
        return menu;
    }

    public void start() {
        boolean isRunning = true;
        while (isRunning) {
            displayMenu();
            int choice = scanner.nextInt();

            if (choice == 5) {
                isRunning = false;
                continue;
            }

            processChoice(choice);
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n---------------Menu---------------");
        menu.forEach((key, coffee) ->
                System.out.printf("%d - %s ($%.2f)%n", key, coffee.getName(), coffee.getMoneyNeeded()));
        System.out.println("4 - Report");
        System.out.println("5 - Exit");
        System.out.print("Enter your choice: ");
    }

    private void processChoice(int choice) {
        Coffee selectedCoffee = menu.get(choice);

        if (selectedCoffee != null) {
            System.out.printf("You have chosen %s%n", selectedCoffee.getName());
            Transactions transaction = new Transactions(selectedCoffee, resources);

            if (transaction.checkResources() && transaction.processTransaction(scanner)) {
                transaction.makeCoffee();
                System.out.printf("Here is your %s ☕%n", selectedCoffee.getName());
            }
        } else if (choice == 4) {
            resources.displayResources();
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();
    }
}
