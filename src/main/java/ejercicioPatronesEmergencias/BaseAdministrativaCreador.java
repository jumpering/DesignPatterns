package ejercicioPatronesEmergencias;

public class BaseAdministrativaCreador extends BaseCreador{

    @Override
    public Base crearBase(String nombre) {
        return new BaseAdministrativa(nombre);
    }
}
