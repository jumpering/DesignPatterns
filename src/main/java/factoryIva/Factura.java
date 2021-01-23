package factoryIva;

public class Factura {
    private int id;
    private double amount;
    private TypeIva typeIva;

    public Factura(TypeIva typeIva){
        this.typeIva = typeIva;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getImporte() {

        return amount;
    }

    public void setImporte(double importe) {

        this.amount = importe;
    }

    public double getImporteIva(){
        return this.amount * this.typeIva.amountIva();
    };
}
