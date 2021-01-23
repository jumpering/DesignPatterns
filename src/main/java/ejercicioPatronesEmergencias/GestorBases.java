package ejercicioPatronesEmergencias;

public class GestorBases {

    private BaseCreador baseCreador;
    private String nombre;

    public Base crearBase (BaseCreador baseCreador, String nombre){
        return baseCreador.crearBase(nombre);
    }


}
