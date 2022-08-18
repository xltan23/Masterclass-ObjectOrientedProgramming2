package oop.h;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price; 

    private String addition2Name;
    private double addition2Price; 

    private String addition3Name;
    private double addition3Price; 

    private String addition4Name;
    private double addition4Price; 

    public Hamburger(double price, String name, String meat, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String n, double p) {
        this.addition1Name = n;
        this.addition1Price = p;
    }

    public void addHamburgerAddition2(String n, double p) {
        this.addition2Name = n;
        this.addition2Price = p;
    }

    public void addHamburgerAddition3(String n, double p) {
        this.addition3Name = n;
        this.addition3Price = p;
    }

    public void addHamburgerAddition4(String n, double p) {
        this.addition4Name = n;
        this.addition4Price = p;
    }

    public double itemizehamburger() {
        System.out.printf("Ordered burger: %s with %s and %s\n", name, meat, breadRollType);
        double hamburgerPrice = price;
        if (addition1Name != null) {
            System.out.printf("Added %s\n", addition1Name);
            hamburgerPrice += addition1Price;
        }
        if (addition2Name != null) {
            System.out.printf("Added %s\n", addition2Name);
            hamburgerPrice += addition2Price;
        }
        if (addition3Name != null) {
            System.out.printf("Added %s\n", addition3Name);
            hamburgerPrice += addition3Price;
        }
        if (addition4Name != null) {
            System.out.printf("Added %s\n", addition4Name);
            hamburgerPrice += addition4Price;
        }

        return hamburgerPrice;
    }  
}
