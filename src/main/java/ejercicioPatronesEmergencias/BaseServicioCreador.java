package ejercicioPatronesEmergencias;

public class BaseServicioCreador extends BaseCreador{

    @Override
    public Base crearBase(String nombre) {
        return new BaseServicio(nombre);
    }
}
