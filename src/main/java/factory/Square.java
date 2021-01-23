package factory;

public class Square extends Shape{

    private double base;
    private double altura;

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }

    @Override
    public void setRadio(double radio) {

    }
}
