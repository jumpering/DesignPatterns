package observer;

public class UsaObserver extends Observer{

    private int diference;

    public UsaObserver(LocalHourChangeSubject localHourChangeSubject){
        super.localHourChangeSubject = localHourChangeSubject;
        super.localHourChangeSubject.addObserver(this);
        this.diference = 6;
    }

    @Override
    public void update() {
        System.out.println("Hora en USA actual: " + super.localHourChangeSubject.getHour() + this.diference + " horas.");
    }
}
