package observer;

public abstract class Observer {

    protected LocalHourChangeSubject localHourChangeSubject;

    public abstract void update();
}
