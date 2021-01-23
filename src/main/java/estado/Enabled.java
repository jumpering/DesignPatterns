package estado;

class Enabled implements State {

    private Alarm alarm;
    
    @Override
    public void enable() {
        System.out.println("Alarma ya activada, no se puede volver a activar");
    }

    @Override
    public void disable() {
        System.out.println("Apagando alarma");
        this.alarm.setState(new Disabled());
    }

    @Override
    public void openDoor() {
        System.out.println("alguien a abierto la puerta, la alarma está activada");
        alarm.setState(new Trigger());
        alarm.openDoor();
        
    }

    @Override
    public void openWindow() {
        System.out.println("alguien a abierto la ventana,la alarma está activada");
        alarm.setState(new Trigger()); 
        alarm.openWindow();
    }
    
    @Override
    public void trigger(){
        System.out.println("Se puede hacer sonar la alarma, está activada");
        System.out.println("haciendo sonar...");
        alarm.setState(new Trigger());
    }    

    @Override
    public void mostrar() {
        System.out.println("Alarma activa");
    }

    @Override
    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }
    
}
