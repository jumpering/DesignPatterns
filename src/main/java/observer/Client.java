package observer;

public class Client {

    public static void main(String[] args) {
        LocalHourChangeSubject localHourChangeSubject = new LocalHourChangeSubject();
        new CanariasObserver(localHourChangeSubject);
        new UsaObserver(localHourChangeSubject);
        localHourChangeSubject.setHour(2);
        localHourChangeSubject.setHour(4);
    }
}
