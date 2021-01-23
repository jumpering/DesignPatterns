package factoryMethodNaturalNumber;

public class Converter {

    private NaturalNumberCreator naturalNumberCreator;
    private NaturalNumber naturalNumber;

    public void setCreator(NaturalNumberCreator naturalNumberCreator){

        this.naturalNumberCreator = naturalNumberCreator;
        this.naturalNumber = naturalNumberCreator.create();
    }

    public String getNumber(){

        return this.naturalNumber.convert();
    }

    public void setNumber(int num){

        this.naturalNumber.setNumber(num);
    }
}