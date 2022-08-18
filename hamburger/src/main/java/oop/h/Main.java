package oop.h;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(14.30, "Portomello Mushroom", "Beef", "Fluffybread");
        double price = hamburger.itemizehamburger();
        System.out.println(price);
        hamburger.addHamburgerAddition1("Cheese", 1.20);
        hamburger.addHamburgerAddition2("Onion rings", 1);
        hamburger.addHamburgerAddition3("Sesame sauce", 1.50);
        double newPrice = hamburger.itemizehamburger();
        System.out.println(newPrice);

        HealthyBurger healthyBurger = new HealthyBurger(12.10, "Chicken");
        double hPrice = healthyBurger.itemizehamburger();
        System.out.println(hPrice);
        healthyBurger.addHealthyAddition1("Egg", 0.50);
        double hPrice2 = healthyBurger.itemizehamburger();
        System.out.println(hPrice2);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        double dPrice = deluxeBurger.itemizehamburger();
        System.out.println(dPrice);
        deluxeBurger.addHamburgerAddition1("TarTar", 0.90);
        double dPrice2 = deluxeBurger.itemizehamburger();
        System.out.println(dPrice2);
    }
}
