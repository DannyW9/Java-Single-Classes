public class Printer {

    private int quantity;
    private int toner;

    public Printer(int quantity, int toner){
        this.quantity = quantity;
        this.toner = toner;
    }

    public int getPaperQuantity(){
        return this.quantity;
    }

    public int getTonerVolume(){
        return this.toner;
    }

    public int print(int pages, int copies){
        if(this.quantity >= (pages * copies)) {
            this.quantity -= (pages * copies);
            this.toner -= (pages * copies);
        }
        return this.quantity;
    }

}
