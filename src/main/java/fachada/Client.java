package fachada;

public class Client {

    public void exec(){
        int data1 = IO.getInstance().readInt("Primer valor a sumar: ");
        int data2 = IO.getInstance().readInt("Segon valor a sumar: ");
        String stringUnities = IO.getInstance().readText("Text de les unitats: ");
        System.out.println( (data1 + data2) + " " + stringUnities);
    }

    public static void main(String[] args) {
        new Client().exec();
    }
}
