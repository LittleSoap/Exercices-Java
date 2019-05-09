public abstract class Building {

    protected String owner;
    protected String address;
    protected int area;


    public Building() {
    }

    public Building(String owner, String address, int area) {
        this.owner = owner;
        this.address = address;
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract double tax();

    public abstract void print();

}
