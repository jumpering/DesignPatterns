package observer;

public class CanariasObserver extends Observer{

    private int diference;

    public CanariasObserver(LocalHourChangeSubject localHourChangeSubject){
        super.localHourChangeSubject = localHourChangeSubject;
        super.localHourChangeSubject.addObserver(this);
        this.diference = 1;
    }

    @Override
    public void update() {
        System.out.println("Hora en Canarias actual: " + super.localHourChangeSubject.getHour() + this.diference + " horas.");
    }
}
