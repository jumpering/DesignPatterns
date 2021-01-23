package factory;

public class Client {

    private static ShapeCreator shapeCreator = new CircleCreator();
    private static Shape shape;

    public static void main(String[] args) {

        shape =  shapeCreator.create();
        shape.setRadio(10);
        System.out.println("Area: " + shape.area());
        System.out.println(shape.getClass().getSimpleName());
    }
}
