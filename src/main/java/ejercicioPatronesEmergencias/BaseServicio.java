//ejercicio extraido de: https://www.infor.uva.es/~felix/datos/priii/ejercicios_patrones.pdf
package ejercicioPatronesEmergencias;

public class BaseServicio extends Base{

    private int numAmbulancias;

    public void addAmbulancias(int numAmbulancias){
        this.numAmbulancias += numAmbulancias;
    }

    public BaseServicio(String nombre){
        super(nombre);
        this.numAmbulancias = 0;
    }

    @Override
    public int contarAmbulancias() {
        return numAmbulancias;
    }

    @Override
    protected void accept(Escenario escenario) {
        escenario.visit(this);
    }
}
