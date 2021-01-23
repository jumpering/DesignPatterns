package TelemandoCommand;

import java.util.HashMap;
import java.util.Map;

public class Telemando {
    
    //private Tv tv;
    //private Dvd dvd;

//    METODO CLÁSICO CON SWITCH (mierda solución)
//    public void encenderDispositivo(Dispositivos dispositivo){
//
//        switch (dispositivo){
//            case TV:
//                tv = new Tv();
//                tv.enciende();
//                break;
//            case DVD:
//                dvd = new Dvd();
//                dvd.start();
//                break;
//        }
//    }

    private Map< AccionesDispositivos, Command > commandList;

    public Telemando(){
        commandList = new HashMap<AccionesDispositivos, Command>();
    }

    public void addActionDevice(AccionesDispositivos accionesDispositivos, Command command){
        this.commandList.put(accionesDispositivos,command);
    }

    public void runAccion(AccionesDispositivos accionesDispositivos){
        commandList.get(accionesDispositivos).run();
    }
}