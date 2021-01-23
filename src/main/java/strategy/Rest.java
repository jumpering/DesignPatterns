package strategy;

public class Rest implements Operation{
    @Override
    public double operation(double valueA, double valueB) {
        return valueA - valueB;
    }
}
