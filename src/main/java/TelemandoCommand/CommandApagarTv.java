package TelemandoCommand;

public class CommandApagarTv implements Command{

    private Tv tv;

    public CommandApagarTv(Tv tv){

        this.tv = tv;
    }

    @Override
    public void run() {

        this.tv.apaga();
    }
}
