public class Calculator {

    private int numberOne;
    private int numberTwo;

    public Calculator(int x, int y){
        this.numberOne = x;
        this.numberTwo = y;
    }

    public int add(){
        return this.numberOne + this.numberTwo;
    }

    public int subtract(){
        return this.numberOne - this.numberTwo;
    }

    public int multiply(){
        return this.numberOne * this.numberTwo;
    }

    public double divide(){
        double result =  this.numberOne / (double) this.numberTwo;
        return result;
    }


}
