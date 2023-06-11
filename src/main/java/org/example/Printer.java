package org.example;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel>= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        this.tonerLevel+=tonerAmount;
        if(this.tonerLevel > 100 || this.tonerLevel<0){
            return -1;
        }
        else {
            return this.tonerLevel;
        }
    }

    public int printPages(int pagesToBePrinted){
        int sheets = (duplex) ? (pagesToBePrinted/2) + (pagesToBePrinted%2) : pagesToBePrinted;
        pagesPrinted += sheets;
        return sheets;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
