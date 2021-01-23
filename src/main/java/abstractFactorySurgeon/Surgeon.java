package abstractFactorySurgeon;

public class Surgeon {

    private Instrumentalist instrumentalist;

    public Surgeon(){
        this.instrumentalist = new JungleInstrumentalist();
        this.instrumentalist = new OperationRoomInstrumentalist();
    }

    public void interact(){
        this.instrumentalist.getCutterInstrument().cut();
        this.instrumentalist.getJoinInstrument().join();
    }

    public static void main(String[] args) {
        new Surgeon().interact();
    }
}
