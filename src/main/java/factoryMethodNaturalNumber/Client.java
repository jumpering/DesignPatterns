package factoryMethodNaturalNumber;

public class Client {

    private static Converter converter;

    public static void main(String[] args) {

        converter = new Converter();
        converter.setCreator(new NaturalNumberEnCreator());
        converter.setNumber(3);
        System.out.println(converter.getNumber());
    }
}
