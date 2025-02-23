public class Resources {
    private int water;
    private int milk;
    private int coffee;
    private double money;
    private Coffee actualCoffee;
    private Transactions transaction;

    //Constructor
    public Resources(int water, int milk, int coffee, double money, Coffee actualCoffee, Transactions transaction) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.money = money;
        this.actualCoffee = actualCoffee;
        this.transaction = transaction;
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

    public void setMoney(double money) {
        this.money = money;
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


    public void displayResources() {
        System.out.println("--------------Resources--------------" );
        System.out.println("Money: " + this.money);
        System.out.println("Water: " + this.water);
        System.out.println("Milk: " + this.milk);
        System.out.println("Coffee: " + this.coffee);
    }

    public boolean checkResources() {
        if (this.getWater() < actualCoffee.getWaterNeeded()) {
            System.out.println("Insufficient water");
            return false;
        }
        else if (this.getMilk() < actualCoffee.getMilkNeeded()) {
            System.out.println("Insufficient milk");
            return false;
        }
        else if (this.getCoffee() < actualCoffee.getCoffeeNeeded()) {
            System.out.println("Insufficient coffee");
            return false;
        }
        return true;
    }

    public void makeCoffee() {
        if (!checkResources()) {
            System.out.println("Sorry, we are out of service");
        } else {
            setMoney(this.money - transaction.getMoney());
            setWater(this.water);
        }
    }
}
