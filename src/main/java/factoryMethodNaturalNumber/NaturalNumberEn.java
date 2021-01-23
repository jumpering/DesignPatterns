package factoryMethodNaturalNumber;

import java.util.HashMap;

public class NaturalNumberEn extends NaturalNumber{

    private int num;

    private static final HashMap<Integer, String> conversion = new HashMap<Integer, String>()
    {{  put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4,"four");
    }};

    public String convert(){

        return conversion.get(this.num);
    }

    @Override
    public void setNumber(int num) {

        this.num = num;
    }
}
