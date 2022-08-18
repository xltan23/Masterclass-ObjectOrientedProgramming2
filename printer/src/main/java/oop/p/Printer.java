package oop.p;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((tonerLevel + tonerAmount) <= 100) {
                this.tonerLevel += tonerAmount;
                return tonerLevel; 
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint;
        if (duplex) {
            pagesToPrint = pages/2 + pages%2;
        } else {
            pagesToPrint = pages;
        }
        pagesPrinted = pagesToPrint;
        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
