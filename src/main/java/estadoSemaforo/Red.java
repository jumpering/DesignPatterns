package estadoSemaforo;

import java.util.Timer;
import java.util.TimerTask;

class Red implements State {
    
    private SemaforoContext semaforoContext;

    @Override
    public void cross() {
        System.out.println("No puedes cruzar peatón");
    }

    @Override
    public void drive() {
        System.out.println("Puedes conducir vehiculo");
    }

    @Override
    public void showState() {
        System.out.println("Rojo");
    }

    @Override
    public void setSemaforoContext(SemaforoContext semaforoContext) {
        this.semaforoContext = semaforoContext;
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                Red.this.semaforoContext.setState(new Green());
            }               
        }, 10000);    }

    
}
