package compositeProducts;

public class Product extends ProductsTree{

    public Product(String name, double price){
        super(name, price);
    }

    @Override
    public void add(ProductsTree productsTree) {
        System.out.println("No se puede agregar un producto sobre si mismo");
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getPriceV2() {
        return this.price;
    }
}
