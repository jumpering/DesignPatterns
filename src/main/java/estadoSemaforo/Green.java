package estadoSemaforo;

import java.util.Timer;
import java.util.TimerTask;

class Green implements State {
    
    private SemaforoContext semaforoContext;

    @Override
    public void cross() {
        System.out.println("Puede cruzar, está en verde");
    }

    @Override
    public void drive() {
        System.out.println("No puede seguir circulando coche, está en verde para los peatones");
    }

    @Override
    public void showState() {
        System.out.println("Verde");
    }

    @Override
    public void setSemaforoContext(SemaforoContext semaforoContext) {
        this.semaforoContext = semaforoContext;
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                Green.this.semaforoContext.setState(new Orange());
            }    
                    
        }, 10000);
    }

    
}
