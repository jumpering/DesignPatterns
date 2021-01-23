package VehicleDecorator;

public class Client {

    public void exectute(){

        Vehicle vehicle = new Vehicle(100,"Corsa");
        DecoratorGPS decoratorGPS = new DecoratorGPS(vehicle,1000,"Garmin");
        DecoratorMP3 decoratorMP3 = new DecoratorMP3(decoratorGPS,200,"Philips Player");
        System.out.println(vehicle.view());
        System.out.println("---------------");
        System.out.println(decoratorGPS.view());
        System.out.println("---------------");
        System.out.println(decoratorMP3.view());
    }

    public static void main(String[] args)   {
        new Client().exectute();
    }
}
