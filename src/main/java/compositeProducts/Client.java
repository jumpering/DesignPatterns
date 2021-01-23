package compositeProducts;

public class Client {
    public static void main(String[] args) {
        ProductsTree c1 = new ProductComposite("c1");
        ProductsTree b = new Product("b",500);
        ProductsTree c2 = new ProductComposite("c2");
        ProductsTree f = new Product("f", 100);
        ProductsTree c3 = new ProductComposite("c3");
        ProductsTree s1 = new Product("s1", 150);
        ProductsTree s2 = new Product("s2", 100);
        ProductsTree s3 = new Product("s3", 50);

        c3.add(s1);
        c3.add(s2);
        c3.add(s3);
        c2.add(c3);
        c2.add(f);
        c1.add(c2);
        c1.add(b);
        System.out.println("Price: " + c1.getPrice());
        System.out.println("Price V2: " + c1.getPriceV2());
    }
}
