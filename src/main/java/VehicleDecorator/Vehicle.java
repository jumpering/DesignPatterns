package VehicleDecorator;

public class Vehicle extends Component{

    private double price;
    private String brand;

    public Vehicle(double price, String brand){
        this.price = price;
        this.brand = brand;
    }

    @Override
    public double view() {
        System.out.println(this.brand);
        return this.price;
    }
}
