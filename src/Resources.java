//This class only takes care of the resources
public class Resources {
    private int water = 300;
    private int milk = 200;
    private int coffee = 100;
    private double money = 0.0;


    //Constructor

    public Resources(int water, int milk, int coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
    }

    //GETTERS AND SETTERS
    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public double getMoney() {
        return money;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void displayResources() {
        System.out.println("--------------Resources--------------" );
        System.out.println("Money: " + this.getMoney());
        System.out.println("Water: " + this.getWater());
        System.out.println("Milk: " + this.getMilk());
        System.out.println("Coffee: " + this.getCoffee());
    }
}
