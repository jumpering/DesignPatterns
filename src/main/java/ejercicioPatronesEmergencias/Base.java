package ejercicioPatronesEmergencias;

public abstract class Base {

    private String nombre;
    private int tiempoAsistencia;
    private int numAmbulancias;

    public Base(String nombre){
        this.nombre = nombre;
    }

    protected abstract int contarAmbulancias();

    protected abstract void accept(Escenario escenario);

    protected String getNombre(){
        return this.nombre;
    }
}
