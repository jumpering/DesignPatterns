package compositeCalculator;

public class CalculatorNumber extends Calculator{

    private int number;

    public CalculatorNumber(int number){
        this.number = number;
    }

    @Override
    public void calculate() {
        System.out.println(this.number);
    }

    @Override
    public void add(Calculator number1, Calculator number2) {
        System.out.println("No se puede añadir un sobre otro número, elemento hoja");
    }

    public int getNumber() {
        return this.number;
    }
}
