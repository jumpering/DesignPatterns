package compositeProducts;

public abstract class ProductsTree {
    protected String name;
    protected double price;

    public ProductsTree(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract void add(ProductsTree productsTree);

    public abstract double getPrice(); // version Java 8+ funcional Lambda

    public abstract double getPriceV2();//version Java 7- imperativa

}
