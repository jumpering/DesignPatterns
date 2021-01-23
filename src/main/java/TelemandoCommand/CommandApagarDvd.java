package TelemandoCommand;

public class CommandApagarDvd implements Command{

    private Dvd dvd;

    public CommandApagarDvd(Dvd dvd){

        this.dvd = dvd;
    }

    @Override
    public void run() {

        this.dvd.stop();
    }
}
