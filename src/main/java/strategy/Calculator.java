package strategy;

public class Calculator {

    private double valueA;
    private double valueB;
    private Operation operation;

    public Calculator(){
        //void on purpose
    }

    public void setValueA(double valueA) {
        this.valueA = valueA;
    }

    public void setValueB(double valueB) {
        this.valueB = valueB;
    }

    public void setOperation (Operation operation){
        this.operation = operation;
    }

    public double result() {
        return operation.operation(this.valueA, this.valueB);
    }
}
