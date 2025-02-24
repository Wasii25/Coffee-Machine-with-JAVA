import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Coffee espresso = new Coffee("Espresso", 50, 0, 18, 1.50);
        Coffee latte = new Coffee("Latte", 200, 150, 24, 2.50);
        Coffee cappuccino = new Coffee("Cappuccino", 250, 100, 24, 3.00);

        Resources resources = new Resources(300, 200, 100);

        boolean startMachine = true;
        while(startMachine) {
            System.out.println("---------------Menu---------------");
            System.out.println("1 - Espresso");
            System.out.println("2 - Latte");
            System.out.println("3 - Cappuccino");
            System.out.println("4 - Report");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You have chosen " + espresso.getName());

                    Transactions transaction = new Transactions(espresso, resources);


                    transaction.transaction(sc);
                    transaction.makeCoffee();

                    System.out.println("Here is your " + espresso.getName() +" ☕");
                    break;

                case 2:
                    System.out.println("You have chosen " + latte.getName());

                    Transactions transaction2 = new Transactions(latte, resources);


                    transaction2.transaction(sc);
                    transaction2.makeCoffee();

                    System.out.println("Here is your " + latte.getName() +" ☕");
                    break;


                case 3:
                    System.out.println("You have chosen " + cappuccino.getName());

                    Transactions transaction3 = new Transactions(cappuccino, resources);


                    transaction3.transaction(sc);
                    transaction3.makeCoffee();

                    System.out.println("Here is your " + cappuccino.getName() +" ☕");
                    break;

                case 5:
                    startMachine = false;
                    break;


                default:
                    resources.displayResources();
                    break;



            }
        }
    }
}