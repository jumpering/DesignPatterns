package TelemandoCommand;

public class CargadorAccionesDispositivosTelemando {

    Telemando telemando;
    Tv tv;
    Dvd dvd;

    public CargadorAccionesDispositivosTelemando(Telemando telemando){

        this.telemando = telemando;
        tv = new Tv();
        telemando.addActionDevice(AccionesDispositivos.ENCENDER_TV,new CommandEnciendeTv(tv));
        telemando.addActionDevice(AccionesDispositivos.APAGAR_TV,new CommandApagarTv(tv));
        dvd = new Dvd();
        telemando.addActionDevice(AccionesDispositivos.ENCENDER_DVD, new CommandEnciendeDvd(dvd));
        telemando.addActionDevice(AccionesDispositivos.APAGAR_DVD, new CommandApagarDvd(dvd));
    }

}
