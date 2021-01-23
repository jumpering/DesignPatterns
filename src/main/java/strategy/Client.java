package strategy;

import java.util.Scanner;

public class Client {

    private static Operation operation;
    private static Calculator calculator;

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        calculator = new Calculator();
        do {
            System.out.print("Inserte valor A: ");
            calculator.setValueA(objScanner.nextDouble());
            System.out.print("Inserte valor B: ");
            calculator.setValueB(objScanner.nextDouble());
            System.out.println("Selecciones operación: \n1-Sumar\n2-Restar\n3-Division");
            switch (objScanner.nextInt()) {
                case 1:
                    calculator.setOperation(new Sum());
                    System.out.println(calculator.result());
                    break;
                case 2:
                    calculator.setOperation(new Rest());
                    System.out.println(calculator.result());
                    break;
                case 3:
                    calculator.setOperation(new Divide());
                    System.out.println(calculator.result());
                    break;
            }
        }
        while (true);
    }
}
