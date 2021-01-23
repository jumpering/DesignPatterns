package strategy;

public class Sum implements Operation {
    @Override
    public double operation(double valueA, double valueB) {
        return valueA + valueB;
    }
}
