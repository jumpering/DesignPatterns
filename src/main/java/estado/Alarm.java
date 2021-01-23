package estado;

import java.util.Scanner;

class Alarm {
    
    private State state;
    
    public Alarm(){
        this.setState(new Disabled());
    }
    
    public void enable(){
        this.state.enable();
    }
    
    public void disable(){
        this.state.disable();
    }
    
    public void openDoor(){
        this.state.openDoor();
    }
    
    public void openWindow(){
        this.state.openWindow();            
    }
    
    public void trigger(){
        this.state.trigger();
    }
    
    public void mostrar(){
        this.state.mostrar();
    }
    
    
    public void setState(State state){
        this.state = state;
        this.state.setAlarm(this);
    }
    
    public static void main(String[] args){
        Alarm alarm = new Alarm();
        Scanner objScanner = new Scanner(System.in);
        while(true){
            System.out.println("Seleccionar opción:\n1- Activar alarma\n2- Apagar alarma\n3- Abrir puerta\n4- Abrir ventana\n5- Mostrar estado alarma\n6- Salir");
            int userOption = objScanner.nextInt();
            switch(userOption){   
                case 1: 
                    alarm.enable();
                    break;
                case 2:
                    alarm.disable();
                    break;
                case 3:
                    alarm.openDoor();
                    break;
                case 4:
                    alarm.openWindow();
                    break;
                case 5:
                    alarm.mostrar();
                    break;
                case 6:
                    System.out.println("...saliendo");
                    System.exit(0);
            }   
        }
    }
    
}
