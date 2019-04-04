package exercises;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Exercice2 {

    public Exercice2() {
    }

    BufferedReader reader;

    public void readFile(String text){

        try {

            reader = new BufferedReader(new FileReader(text));
            List<Integer> arrayList = new ArrayList<Integer>();

            String line;

            line = reader.readLine();

            while (line != null) {

                int score = Integer.parseInt(line.split(":")[1]);

                System.out.println(line);
                System.out.println(score);
                arrayList.add(score);
                line = reader.readLine();
            }

            int average = 0;

            for (int i = 0; i < arrayList.size(); i++) {
                average += arrayList.get(i);
            }

            average /= arrayList.size();

            System.out.println("Moyenne : " + average);

        }catch (FileNotFoundException e){
            //e.printStackTrace();
            System.out.println("Fichier non trouvé");
        }catch (Exception e){
            System.out.println("Fichier inaccessible");
        }
    }

    public void getExecutionTime(String text, String email)
    {
        try {

            Instant start = Instant.now();
            this.getStudentGrade(text, email);

            Duration duration = Duration.between(start, Instant.now());
            System.out.println("Temps d'exécution du programme : " + duration.toString().substring(2).replaceAll("(\\d[HMS])(?!$)", "$1 ").toLowerCase());

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public String getStudentGrade(String text, String email){

        try {
            reader = new BufferedReader(new FileReader(text));
            String line = reader.readLine();
            String score = "";

            while (line != null) {

                if (line.split(":")[0].equals(email)) {
                    score = line.split(":")[1];
                }

                line = reader.readLine();
            }

            if (!score.equals("")) {
                return score;
            }

            return "";

        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }


}