package estado;

import java.util.Timer;
import java.util.TimerTask;

class Trigger implements State {

    private Alarm alarm;

    @Override
    public void enable() {
        System.out.println("No se puede encender la alarma mientras suena");
    }

    @Override
    public void disable() {
        System.out.println("No se puede apagar la alarma mientras suena");
    }

    @Override
    public void openDoor() {
        System.out.println("RIIIINNNNG puerta abierta");
    }

    @Override
    public void openWindow() {
        System.out.println("RIIIINNNNG ventana abierta");
    }

    @Override
    public void trigger() {
        System.out.println("alarma ya sonando, no se puede volver hacer sonar mientras suena");
    }

    @Override
    public void mostrar() {
        System.out.println("Alarma sonando!");
    }

    @Override
    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){           
            @Override
            public void run(){
                Trigger.this.alarm.setState(new Enabled());
            }
        }, 7000);
    }  
    
}
