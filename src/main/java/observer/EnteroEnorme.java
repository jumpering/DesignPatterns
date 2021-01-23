package observer;

import java.util.Objects;

public class EnteroEnorme {

    private int value;

    public EnteroEnorme(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getString(){
        return String.valueOf(this.value);
    }

//    @Override
//    public boolean equals(Object o){
//        EnteroEnorme forEquals = (EnteroEnorme) o;
//        if (this.value != forEquals.value){
//            return false;
//        } else {
//            return true;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnteroEnorme that = (EnteroEnorme) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
