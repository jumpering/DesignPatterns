package observer;

import java.util.ArrayList;
import java.util.List;

public class LocalHourChangeSubject {

    public LocalHourChangeSubject(){
        listObservers = new ArrayList<>();
    }

    private int hour;
    List<Observer> listObservers;

    public void setHour(int hour){
        this.hour = hour;
        notifyObservers();
    }

    public int getHour(){
        return this.hour;
    }

    private void notifyObservers() {
        listObservers.forEach(o ->o.update());
    }

    public void addObserver (Observer observer){
        listObservers.add(observer);
   }

   public void deleteObserver (Observer observer){
        listObservers.remove(observer);
   }
}