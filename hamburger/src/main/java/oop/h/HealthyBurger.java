package oop.h;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(double price, String meat) {
        super(price, "Healthy", meat, "Wholemeal bread");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizehamburger() {
        double hamburgerPrice = super.itemizehamburger();
        if (this.healthyExtra1Name != null) {
            System.out.printf("Added %s to the healthy burger\n", healthyExtra1Name);
            hamburgerPrice += healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            System.out.printf("Added %s to the healthy burger\n", healthyExtra2Name);
            hamburgerPrice += healthyExtra2Price;
        }
        return hamburgerPrice;
    }
}
