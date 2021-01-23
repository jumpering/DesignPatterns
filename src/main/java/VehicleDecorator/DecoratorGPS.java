package VehicleDecorator;

public class DecoratorGPS extends Decorator{

    private String GPS;
    private double price;

    public DecoratorGPS(Component component, double price,String GPS) {
        super(component);
        this.price = price;
        this.GPS = GPS;
    }

    @Override
    public double view() {
        System.out.println(this.GPS);
        return this.price + this.component.view();
    }
}
