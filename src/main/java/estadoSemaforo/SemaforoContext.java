package estadoSemaforo;

import java.util.Scanner;

class SemaforoContext {
    
    private State state;
    
    public SemaforoContext(){
    
        this.setState(new Green());
    }
    
    public void cross(){
       this.state.cross();
    }
    
    public void drive(){
        this.state.drive();
    }
    
    public void showState(){
        this.state.showState();
    }
    
    public void setState(State state){
        this.state = state;
        this.state.setSemaforoContext(this);
    }
    
    public static void main(String[] args){
        SemaforoContext semaforoContext = new SemaforoContext();
        Scanner objScanner = new Scanner(System.in);    
        while(true){
            System.out.println("1- Cruzar a pie\n2- Conducir\n3- Mirar semaforo\n4- Salir");
            int userOption = objScanner.nextInt(); 
            switch(userOption){
                case 1:
                    semaforoContext.cross();
                    break;
                case 2:
                    semaforoContext.drive();
                    break;
                case 3:
                    semaforoContext.showState();
                    break;
                case 4:    
                    System.out.println("..saliendo");
                    System.exit(0);
                default:
                    break;
            }
        }  
    }
}