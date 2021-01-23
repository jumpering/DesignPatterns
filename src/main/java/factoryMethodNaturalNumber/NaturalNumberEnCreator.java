package factoryMethodNaturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator{

    @Override
    public NaturalNumber create() {

        return new NaturalNumberEn();
    }
}
