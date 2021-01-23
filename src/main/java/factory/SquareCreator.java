package factory;

public class SquareCreator implements ShapeCreator{

    @Override
    public Shape create() {

        return new Square();
    }
}