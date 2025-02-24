public class Coffee {
    private final String name;
    private final int waterNeeded;
    private final int milkNeeded;
    private final int coffeeNeeded;
    private final double moneyNeeded;

    public static class CoffeeBuilder {
        private String name;
        private int waterNeeded;
        private int milkNeeded;
        private int coffeeNeeded;
        private double moneyNeeded;

        public CoffeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CoffeeBuilder water(int water) {
            this.waterNeeded = water;
            return this;
        }

        public CoffeeBuilder milk(int milk) {
            this.milkNeeded = milk;
            return this;
        }

        public CoffeeBuilder coffee(int coffee) {
            this.coffeeNeeded = coffee;
            return this;
        }

        public CoffeeBuilder price(double price) {
            this.moneyNeeded = price;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }

    private Coffee(CoffeeBuilder builder) {
        this.name = builder.name;
        this.waterNeeded = builder.waterNeeded;
        this.milkNeeded = builder.milkNeeded;
        this.coffeeNeeded = builder.coffeeNeeded;
        this.moneyNeeded = builder.moneyNeeded;
    }

    // Constructor for backward compatibility
    Coffee(String name, int waterNeeded, int milkNeeded, int coffeeNeeded, double moneyNeeded) {
        this.name = name;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.coffeeNeeded = coffeeNeeded;
        this.moneyNeeded = moneyNeeded;
    }

    // Getters
    public String getName() { return name; }
    public int getWaterNeeded() { return waterNeeded; }
    public int getMilkNeeded() { return milkNeeded; }
    public int getCoffeeNeeded() { return coffeeNeeded; }
    public double getMoneyNeeded() { return moneyNeeded; }
}