package TelemandoCommand;

public class CommandEnciendeTv implements Command{

    private Tv tv;

    public CommandEnciendeTv(Tv tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        this.tv.enciende();
    }
}
