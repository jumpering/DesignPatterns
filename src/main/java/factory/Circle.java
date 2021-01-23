package factory;

public class Circle extends Shape{

    private double radio;

    public double getRadio(){
        return this.radio;
    }

    @Override
    public double area() {
        return 3.1416 * Math.pow(this.radio,2);
    }

    @Override
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void setBase(double base) {

    }

    @Override
    public void setAltura(double altura) {

    }
}
