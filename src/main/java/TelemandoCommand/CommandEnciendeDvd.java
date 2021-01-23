package TelemandoCommand;

public class CommandEnciendeDvd implements Command{

    private Dvd dvd;

    public CommandEnciendeDvd(Dvd dvd){

        this.dvd = dvd;
    }

    @Override
    public void run() {

        this.dvd.start();
    }
}
