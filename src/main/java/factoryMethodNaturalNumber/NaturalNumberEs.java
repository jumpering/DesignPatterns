package factoryMethodNaturalNumber;

import java.util.HashMap;

public class NaturalNumberEs extends NaturalNumber{

    private int num;

    private static final HashMap<Integer, String> conversion = new HashMap<Integer, String>()
    {{  put(1, "uno");
        put(2, "dos");
        put(3, "tres");
        put(4,"cuatro");
    }};

    public String convert(){

        return conversion.get(this.num);
    }

    @Override
    public void setNumber(int num) {
        this.num = num;
    }
}
