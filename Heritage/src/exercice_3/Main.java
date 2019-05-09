package exercice_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Building> buildings = Arrays.asList(
                new Villa("Matthieu", "10 rue du Test", 300, 10, true),
                new Villa("Antoine", "12 rue du Test", 200, 5, false),
                new Company("Frédéric", "15 rue du test", 1000, "TheCompany", 250, 12),
                new Company("Frédéric2", "17 rue du lelele", 300, "TheCompany2", 5, 2),
                new Villa("Matthieu2", "10 rue du Test", 300, 10, true),
                new Villa("Antoine2", "16 rue du Test", 200, 5, true),
                new Company("Frédéric3", "34 rue du test", 3000, "TheCompany", 600, 12),
                new Company("Frédéric4", "20 rue du lelele", 70, "TheCompany2", 2, 0)
        );

        int totalArea =  buildings.stream().mapToInt(b->b.getArea()).sum();
        System.out.println("Surface totale : " + totalArea);

        double totalTax = buildings.stream().mapToDouble(b->b.tax()).sum();
        System.out.println("Impôt global : " + totalTax + " €");

        int nbSwimmingPool = Math.toIntExact(buildings.stream().filter(building -> building instanceof Villa).filter(v -> ((Villa) v).isSwimming_pool()).count());
        System.out.println("Nombre de piscines : " + nbSwimmingPool);

        List<Building> SortedByArea = buildings.stream().sorted(Comparator.comparing(building -> building.getArea())).collect(Collectors.toList());
        SortedByArea.forEach(Building::print);

        List<Building> SortedByOwner = buildings.stream().sorted(Comparator.comparing(building -> building.getOwner())).collect(Collectors.toList());
        SortedByOwner.forEach(Building::print);



    }
}
