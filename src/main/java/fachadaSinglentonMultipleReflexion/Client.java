package fachadaSinglentonMultipleReflexion;

public class Client {

    public void exec() {


        int data1 = IO.getInstance().readInt("Primer valor a sumar: ");
        int data2 = IO.getInstance().readInt("Segon valor a sumar: ");
        int A = IO.getInstance().readInt("");
        int B = IO.getInstance().readInt("");
        String stringUnities = IO.getInstance().readText("Text de les unitats: ");
        System.out.println( (data1 + data2) + " " + stringUnities);
        System.out.println(System.identityHashCode(A));
        System.out.println(System.identityHashCode(B));
        System.out.println(A == B);
    }

    public static void main(String[] args) {
        new Client().exec();
    }
}
