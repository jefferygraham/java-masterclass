package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int amt) {
        if (amt > 0 && amt <= 100) {
            if(this.tonerLevel + amt > 100) {
                return -1;
            } else {
                this.tonerLevel += amt;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int numPages) {
        int pagesToPrint = numPages;
        if(this.duplex) {
            pagesToPrint = (numPages / 2) + (numPages % 2);
            System.out.println("Printing duplex");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

}
