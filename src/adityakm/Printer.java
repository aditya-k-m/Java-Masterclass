package adityakm;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.duplex = duplex;
        if(tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
    }

    public int addToner (int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if ((tonerAmount + this.tonerLevel) > 100)
                return -1;
            else{
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        else
            return -1;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (duplex){
            if(pagesToPrint % 2 == 0) {
                this.pagesPrinted += (pagesToPrint / 2);
                return pagesToPrint/2;
            }
            else {
                this.pagesPrinted += (pagesToPrint / 2 + 1);
                return (pagesToPrint / 2 + 1);
            }
        }
        else{
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

}
