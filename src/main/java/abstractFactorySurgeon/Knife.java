package abstractFactorySurgeon;

public class Knife extends CutterTools {

    public Knife(){
        this.sharp = 8;
        this.precision = 5;
    }

    @Override
    public void cut() {
        System.out.println("dirty cut");
    }
}
