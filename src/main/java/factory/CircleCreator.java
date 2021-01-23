package factory;

public class CircleCreator implements ShapeCreator{

    @Override
    public Shape create() {

        return new Circle();
    }
}