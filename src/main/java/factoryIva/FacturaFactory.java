package factoryIva;

public class FacturaFactory {

    public Factura createFactura(TypeIva typeIva){
        return new Factura(typeIva);
    }
}
