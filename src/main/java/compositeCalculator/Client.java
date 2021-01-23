package compositeCalculator;

public class Client {
    public static void main(String[] args) {
        Calculator sum1 = new CalculatorSum();
        Calculator number1 = new CalculatorNumber(8);
        Calculator number2 = new CalculatorNumber(2);
        sum1.add(number1, number2);
        sum1.calculate();
        Calculator number3 = new CalculatorNumber(2);
        Calculator number4 = new CalculatorNumber(3);
        Calculator sum2 = new CalculatorSum();
        sum2.add(number3, number4);
        sum2.calculate();
        Calculator sum3 = new CalculatorSum();
        sum3.add(sum1, sum2);
        sum3.calculate();
        Calculator multi1 = new CalculatorMulti();
        multi1.add(sum1,sum2);
        multi1.calculate();
    }
}
