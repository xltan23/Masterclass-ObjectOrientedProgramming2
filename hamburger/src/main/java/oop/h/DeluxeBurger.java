package oop.h;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super(19.10, "Deluxe", "Bacon and Cheese", "Sesame Bun");
        super.addHamburgerAddition1("chips", 2.50);
        super.addHamburgerAddition2("coke", 1.50);
    }

    @Override
    public void addHamburgerAddition1(String n, double p) {
        System.out.println("Cannot add anything on deluxe burgers\n");
    }

    @Override
    public void addHamburgerAddition2(String n, double p) {
        System.out.println("Cannot add anything on deluxe burgers\n");
    }

    @Override
    public void addHamburgerAddition3(String n, double p) {
        System.out.println("Cannot add anything on deluxe burgers\n");
    }

    @Override
    public void addHamburgerAddition4(String n, double p) {
        System.out.println("Cannot add anything on deluxe burgers\n");
    } 
}
