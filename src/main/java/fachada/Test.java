package fachada;

public class Test {

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); //false

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); //true

        Integer f = 129;
        Integer g = 129;
        System.out.println(f == g); //false

        Integer h = 100;
        Integer i = 100;
        System.out.println(h == i); //false

    }
}