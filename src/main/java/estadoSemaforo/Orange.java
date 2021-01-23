package estadoSemaforo;

import java.util.Timer;
import java.util.TimerTask;

class Orange implements State {
    
    private SemaforoContext semaforoContext;

    @Override
    public void cross() {
        System.out.println("corre peatón, está en ambar!");
    }

    @Override
    public void drive() {
        System.out.println("preparate vehiculo, en breves podrás circular");
    }

    @Override
    public void showState() {
        System.out.println("Ambar");
    }

    @Override
    public void setSemaforoContext(SemaforoContext semaforoContext) {
        this.semaforoContext = semaforoContext;
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                Orange.this.semaforoContext.setState(new Red());
            }    
                    
        }, 4000);        
    }   
}
