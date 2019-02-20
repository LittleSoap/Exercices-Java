package Exercices;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Partie 1
        Scanner sc = new Scanner(System.in);
        De de = new De(6);
        de.lancerDe();
        de.displayDe();

        //Partie 2
        System.out.println("Choisir un nombre de lancer");
        int value = sc.nextInt();

        for (int i = 0; i < value; i++) {
            de.lancerDe();
            de.displayDe();
        }

        //Partie 3
        De de1 = new De(6);
        De de2 = new De(6);

        System.out.println("Choisir un nombre de lancer");
        value = sc.nextInt();

        for (int i = 0; i < value; i++) {
            de1.lancerDe();
            de2.lancerDe();
            de1.displayDe();
            de2.displayDe();

            if (de1.getValue() == de2.getValue()) {
                System.out.println("Gagné !!");
            } else {
                System.out.println("Perdu :(");
            }
        }

    }

}
