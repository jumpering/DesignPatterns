/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

/**
 *
 * @author jumpe
 */
class Disabled implements State{

    private Alarm alarm;
    
    @Override
    public void enable() {
        System.out.println("Se pasa alarma a modo encendido");
        this.alarm.setState(new Enabled());
    }

    @Override
    public void disable() {
        System.out.println("Alarma ya apagada, no se puede volver a apagar");
    }

    @Override
    public void openDoor() {
        System.out.println("se abre la puerta pero no suena la alarma");
    }

    @Override
    public void openWindow() {
        System.out.println("se abre la ventana pero no suena la alarma");
    }
    
    @Override
    public void trigger(){
        System.out.println("No se puede hacer sonar la alarma, está desactivada");
    }

    @Override
    public void mostrar() {
        System.out.println("Alarma apagada");
    }

    @Override
    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    
}
