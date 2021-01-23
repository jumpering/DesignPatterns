package TelemandoCommand;

public class Client {

    private static Telemando telemando;
    private static CargadorAccionesDispositivosTelemando cargadorAccionesDispositivosTelemando;

    public static void main(String[] args){

        telemando = new Telemando();
        //telemando.encenderDispositivo(Dispositivos.DVD); //CON METODO SWITCH
        cargadorAccionesDispositivosTelemando = new CargadorAccionesDispositivosTelemando(telemando);
        telemando.runAccion(AccionesDispositivos.ENCENDER_TV);
        telemando.runAccion(AccionesDispositivos.APAGAR_TV);
        telemando.runAccion(AccionesDispositivos.ENCENDER_DVD);
        telemando.runAccion(AccionesDispositivos.APAGAR_DVD);
    }
}