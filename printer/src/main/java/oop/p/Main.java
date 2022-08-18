package oop.p;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println(printer.getPagesPrinted());
        printer.printPages(5);
        System.out.println(printer.getPagesPrinted());

        Printer printer2 = new Printer(60, false);
        System.out.println(printer2.addToner(70));
        printer2.printPages(9);
        System.out.println(printer2.getPagesPrinted());
    }
}
