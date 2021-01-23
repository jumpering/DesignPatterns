package strategyLoginSample;

import java.util.Scanner;

public class Client {

    private static LoginStrategy loginStrategy;
    private static Scanner objScanner;

    public static void main(String[] args) {
        objScanner = new Scanner(System.in);
        System.out.println("Inserte metodo de login: \n1 - Mail\n2 - DNI\n3 - Google Acount");
        switch (objScanner.nextInt()) {
            case 1:
                loginStrategy = new LoginFormMail();
                System.out.println(loginStrategy.loginForm());
                break;
            case 2:
                loginStrategy = new LoginFormDNI();
                System.out.println(loginStrategy.loginForm());
                break;
            case 3:
                loginStrategy = new LoginFormGoogle();
                System.out.println(loginStrategy.loginForm());
                break;
        }
    }
}
