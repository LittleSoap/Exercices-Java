package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice3{


    public Exercice3(){};

    public int getArrayAverage(){

        try {

            List<Character> arrayList = new ArrayList<Character>();

            System.out.println("Entrer une chaine d'entier");

            Scanner sc = new Scanner(System.in);
            String string = sc.nextLine();
            int nbInt = 0;
            int average = 0;

            for (int i = 0; i < string.length(); i++) {

                arrayList.add(string.charAt(i));

                if (Character.isDigit(arrayList.get(i))) {

                    average += Character.getNumericValue(arrayList.get(i));
                    nbInt ++;

                }else {
                    throw new Exception("La chaine entree est non numérique");
                }
            }

            System.out.println("Somme des entiers : " + average);

            average /= nbInt;

            return average;

        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }

    }

    public int getArrayAverageMain() throws Exception{

        List<Character> arrayList = new ArrayList<Character>();

        System.out.println("Entrer une chaine d'entier");

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int nbInt = 0;
        int average = 0;

        for (int i = 0; i < string.length(); i++) {

            arrayList.add(string.charAt(i));

            if (Character.isDigit(arrayList.get(i))) {

                average += Character.getNumericValue(arrayList.get(i));
                nbInt ++;

            }else {
                throw new Exception("La chaine entree est non numérique");
            }
        }

        System.out.println("Somme des entiers : " + average);

        average /= nbInt;

        return average;

    }


}

