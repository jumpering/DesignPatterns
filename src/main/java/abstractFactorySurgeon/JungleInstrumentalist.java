package abstractFactorySurgeon;

public class JungleInstrumentalist extends Instrumentalist{
    @Override
    public CutterTools getCutterInstrument() {
        return new Scalpel();
    }

    @Override
    public JoinTools getJoinInstrument() {
        return new Tape();
    }
}
