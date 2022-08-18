package oop.c;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Ford is accelerating...";
    }

    @Override
    public String brake() {
        return "Ford is slowing down...";
    }

    @Override
    public String startEngine() {
        return "Ford is starting engine...";
    }
}
