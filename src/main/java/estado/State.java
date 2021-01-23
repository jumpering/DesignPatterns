package estado;

interface State {
        
    public void enable();
    
    public void disable();
    
    public void openDoor();
    
    public void openWindow();
    
    public void trigger();
    
    public void mostrar();
    
    public void setAlarm(Alarm alarm);
    
}
