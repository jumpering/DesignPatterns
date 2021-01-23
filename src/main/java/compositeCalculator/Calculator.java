package compositeCalculator;

public abstract class Calculator {

    public abstract void calculate();

    public abstract void add(Calculator number1, Calculator number2);

    protected abstract int getNumber();
}
