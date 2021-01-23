package strategy;

public class Divide implements Operation{
    @Override
    public double operation(double valueA, double valueB) {
        if (valueA == 0 || valueB == 0) {
            throw new ArithmeticException("No puedes divider entre 0!");
        }
        return valueA / valueB;
    }
}
