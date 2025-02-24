public class Resources {
    private int water;
    private int milk;
    private int coffee;
    private double money;

    public Resources(int water, int milk, int coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.money = 0.0;
    }

    public void updateResources(int waterDelta, int milkDelta, int coffeeDelta, double moneyDelta) {
        water += waterDelta;
        milk += milkDelta;
        coffee += coffeeDelta;
        money += moneyDelta;
    }

    // Getters
    public int getWater() { return water; }
    public int getMilk() { return milk; }
    public int getCoffee() { return coffee; }
    public double getMoney() { return money; }

    public void displayResources() {
        System.out.println("\n--------------Resources--------------");
        System.out.printf("Money: $%.2f%n", money);
        System.out.printf("Water: %dml%n", water);
        System.out.printf("Milk: %dml%n", milk);
        System.out.printf("Coffee: %dg%n", coffee);
        System.out.println("------------------------------------");
    }
}