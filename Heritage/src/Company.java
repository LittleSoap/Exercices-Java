public class Company extends Building {

    private String name;
    private int employeeCounter;
    private int avg;

    public Company(String owner, String address, int area, String name, int employeeCounter, int avg) {
        super(owner, address, area);
        this.name = name;
        this.employeeCounter = employeeCounter;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCounter() {
        return employeeCounter;
    }

    public void setEmployeeCounter(int employeeCounter) {
        this.employeeCounter = employeeCounter;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public double tax() {
        double value = 6.3 * this.area;
        return value;
    }

    @Override
    public void print() {
        System.out.println(
                "Nom : " + this.name +
                "Nombre d'employés :" + this.employeeCounter +
                "Nombre de livraisons moyen : " + this.avg +
                "Adresse : " + this.address +
                "Propriétaire : " + this.owner +
                "Surface : " + this.area
        );
    }
}
