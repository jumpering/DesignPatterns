package factoryIva;

public class Client {

    public static void main(String[] args) {
        Factura miFactura = new FacturaFactory().createFactura(new IvaReducido());
        miFactura.setId(1);
        miFactura.setImporte(126);
        System.out.println(
                "Identificador: " + miFactura.getId()
                + " Importe: " + miFactura.getImporte()
                + " IVA: " + miFactura.getImporteIva());
    }
}
