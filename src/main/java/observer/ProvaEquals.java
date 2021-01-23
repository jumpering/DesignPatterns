package observer;

public class ProvaEquals {

    public void esIgual(EnteroEnorme a, EnteroEnorme b) {
        if (a.getValue() == b.getValue()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void esEqual(EnteroEnorme a, EnteroEnorme b) {
        if (a.getString() == b.getString()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        EnteroEnorme a = new EnteroEnorme(10000);
        EnteroEnorme b = new EnteroEnorme(10000);

        ProvaEquals prova = new ProvaEquals();
        System.out.println("a: " + a.hashCode() + ", b: " + b.hashCode());
       // a = b;
//        prova.esIgual(a,b);
//        prova.esEqual(a,b);

        if (a.equals(b)){
            System.out.println("equals true");
            System.out.println("a: " + a.hashCode() + ", b: " + b.hashCode());

        } else {
            System.out.println("equals false");
            System.out.println("a: " + a.hashCode() + ", b: " + b.hashCode());
        }

    }
}
