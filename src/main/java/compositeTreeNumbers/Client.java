package compositeTreeNumbers;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf1("hoja1"));
        Component sub1 = new Composite("sub1");
        root.add(sub1);
        root.add(new Leaf1("hoja1.1"));
        sub1.add(new Leaf1("hoja2"));
    }

    ////////////root//////////////
    ///hoja1////sub1///hoja1.1////
    ////////////hoja2/////////////


}
