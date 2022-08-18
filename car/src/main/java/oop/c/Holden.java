package oop.c;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Holden is accelerating...";
    }

    @Override
    public String brake() {
        return "Holden is slowing down...";
    }

    @Override
    public String startEngine() {
        return "Holden is starting engine...";
    }  
}
