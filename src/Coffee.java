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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyNeeded() {
        return moneyNeeded;
    }

    public void setMoneyNeeded(double moneyNeeded) {
        this.moneyNeeded = moneyNeeded;
    }

    public int getCoffeeNeeded() {
        return coffeeNeeded;
    }

    public void setCoffeeNeeded(int coffeeNeeded) {
        this.coffeeNeeded = coffeeNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public void setMilkNeeded(int milkNeeded) {
        this.milkNeeded = milkNeeded;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public void setWaterNeeded(int waterNeeded) {
        this.waterNeeded = waterNeeded;
    }
}

