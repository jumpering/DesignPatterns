package VehicleDecorator;

public class DecoratorMP3 extends Decorator{

    private String MP3;
    private double price;

    public DecoratorMP3(Component component, double price, String MP3) {
        super(component);
        this.price = price;
        this.MP3 = MP3;
    }


    @Override
    public double view() {
        System.out.println(this.MP3);
        return this.price + this.component.view();
    }
}
