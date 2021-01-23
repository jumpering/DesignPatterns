package compositeCalculator;

public class CalculatorSum extends Calculator{

    private Calculator[] arrayNumbers;

    public CalculatorSum(){
        this.arrayNumbers = new Calculator[2];
    }

    @Override
    public void calculate() {
        System.out.println("suma total: " + (this.arrayNumbers[0].getNumber() + this.arrayNumbers[1].getNumber()));
    }

    @Override
    public void add(Calculator number1, Calculator number2) {
        this.arrayNumbers[0] = number1;
        this.arrayNumbers[1] = number2;
    }

    @Override
    protected int getNumber() {
        return (this.arrayNumbers[0].getNumber() + this.arrayNumbers[1].getNumber());
    }
}
