package abstractFactorySurgeon;

public class OperationRoomInstrumentalist extends Instrumentalist{
    @Override
    public CutterTools getCutterInstrument() {
        return new Scalpel();
    }

    @Override
    public JoinTools getJoinInstrument() {
        return new Staple();
    }
}
