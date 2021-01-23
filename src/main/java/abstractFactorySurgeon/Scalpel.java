package abstractFactorySurgeon;

public class Scalpel extends CutterTools {

    public Scalpel(){
        this.sharp = 10;
        this.precision = 10;
    }

    @Override
    public void cut() {
        System.out.println("clean cut");
    }
}
