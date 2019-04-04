package exercises;

import exercises.Exercice2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        /*System.out.println(mystery(3,4));


        double []a = {10,20,30};
        double []b = {40,50,60};



        //1) Permutation

        double []c = a;

        a = b;
        b = c;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        double sum = sum(a);
        System.out.println(sum);

        double []newArray = arrayPlusOne(a, 5);



        System.out.println(newArray.length);
        System.out.println(Arrays.toString(newArray));




        //2) Construction complete d'un tableau de 10 SB

        StringBuilder []array = new StringBuilder[10];

        for(int i =0;i<array.length;i++){
            array[i] = new StringBuilder("a");
        }


        //Utilisation listes chainées

        ArrayList<String> list;
        list = new ArrayList<>();

        for(int i =0;i<5;i++){
            list.add("a"+(i+1));
        }

        //Trier la liste : le package permettant de manipuler les liste chainees et les Listes de Tableau est Collections.

        Collections.sort(list);

        System.out.println(list); */

        Exercice2 exercice2 = new Exercice2();

        //exercice2.readFile("test.txt");
        //String score = exercice2.getStudentGrade("test.txt", "matt.allex@gmail.com");

        Exercice3 exercice3 = new Exercice3();

        try{
            int average = exercice3.getArrayAverage();
            System.out.println("Moyenne : " + average);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    //Fonction

    public static double sum(double[]array){

        double sum = 0;

        for(int i=0;i<array.length;i++){
            sum += array[i];
        }

        return sum;

    }

    public static double[] arrayPlusOne(double[]array, int value){

        //Verification que le tableau n'est pas nul




        double []newArray = new double[(array.length) + value];

        for (int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }

        return newArray;
    }

    static int mystery(int x, int y) { // x et y positifs
        if (y == 0) return 0;
        else if (y % 2==0) return 2 * mystery(x, y / 2);
        else return x + (2 * mystery(x, (y - 1) / 2));
    }
}
