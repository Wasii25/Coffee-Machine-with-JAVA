public class Coffee {
    private int waterNeeded;
    private int milkNeeded;
    private int coffeeNeeded;
    private double moneyNeeded;
    private String name;


    Coffee(String name, int waterNeeded, int milkNeeded, int coffeeNeeded, double moneyNeeded) {
        this.name = name;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.coffeeNeeded = coffeeNeeded;
        this.moneyNeeded = moneyNeeded;
    }

    public double getMoneyNeeded() {
        return moneyNeeded;
    }

    public int getCoffeeNeeded() {
        return coffeeNeeded;
    }


    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public String getName() {
        return name;
    }
}

