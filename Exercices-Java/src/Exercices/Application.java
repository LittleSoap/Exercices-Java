package Exercices;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
    ArrayList marks = new ArrayList<Mark>();

    public Application() {}

    public void addMark(Mark mark){
        this.marks.add(mark);
    }

    public boolean equals(Mark mark){
        Iterator<Mark> it = this.marks.iterator();
        while(it.hasNext()){
            Mark currentMark = it.next();
            if(mark.getValue() == currentMark.getValue() && mark.getSubject() == currentMark.getSubject()){
                return true;
            }
        }
        return false;
    }

    public Mark clone(Mark mark){
        Mark clonedMark = new Mark(mark.getValue(), mark.getSubject());
        return clonedMark;
    }

    public void displayArrayMark(){
        Iterator<Mark> it = this.marks.iterator();
        while(it.hasNext()){
            Mark currentMark = it.next();
            System.out.println("Matière : " + currentMark.getSubject());
            System.out.println("Moyenne : " + currentMark.getValue());
        }
    }

}
