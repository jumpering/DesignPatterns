package compositeProducts;

import java.util.ArrayList;
import java.util.List;

public class ProductComposite extends ProductsTree{

    private List<ProductsTree> list;

    public ProductComposite(String name){
        super(name, 0);
        list = new ArrayList<>();
    }

    @Override
    public void add(ProductsTree productsTree) {
        list.add(productsTree);
    }

    @Override
    public double getPrice() {
        //lambda sin referencia a metodo
//        return this.list.stream()
//                .mapToDouble(product -> product.price)
//                .sum();
        //Lambda con referencia a metodo
        return this.list.stream()
                .mapToDouble(ProductsTree::getPrice)
                .sum();
    }

    @Override
    public double getPriceV2() {
        double price = 0;
        for (ProductsTree product : list) {
            price += product.getPriceV2();
        }
        return price;
    }

}
