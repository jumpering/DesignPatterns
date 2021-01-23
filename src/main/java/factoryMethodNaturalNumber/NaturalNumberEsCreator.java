package factoryMethodNaturalNumber;

import java.util.HashMap;

public class NaturalNumberEsCreator extends NaturalNumberCreator{

    @Override
    public NaturalNumber create() {

        return new NaturalNumberEs();
    }
}
