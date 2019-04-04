package Exercices;
import java.util.Random;

public class De {

    private int value;

    public De(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void lancerDe(){
        Random value = new Random();
        this.value = value.nextInt(5) + 1;
    }

    public void displayDe(){
        System.out.println("Résultat du lancer : " + this.value);
    }

}
