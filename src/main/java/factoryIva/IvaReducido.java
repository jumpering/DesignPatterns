package factoryIva;

public class IvaReducido implements TypeIva{
    @Override
    public double amountIva() {
        return 0.5;
    }
}
