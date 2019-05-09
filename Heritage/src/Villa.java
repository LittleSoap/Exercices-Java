public class Villa extends Building {

    private int RoomCounter;
    private boolean swimming_pool;


    public Villa(String owner, String address, int area, int roomCounter, boolean swimming_pool) {
        super(owner, address, area);
        RoomCounter = roomCounter;
        this.swimming_pool = swimming_pool;
    }

    public int getRoomCounter() {
        return RoomCounter;
    }

    public void setRoomCounter(int roomCounter) {
        RoomCounter = roomCounter;
    }

    public boolean isSwimming_pool() {
        return swimming_pool;
    }

    public void setSwimming_pool(boolean swimming_pool) {
        this.swimming_pool = swimming_pool;
    }

    public double tax(){
        double value = RoomCounter *  100;
        if(this.swimming_pool) {
            value += 750;
        }
        return value;
    }

    public void print(){
        System.out.println("Adresse : " + this.address + " Propriétaire : " + this.owner + " Surface : " + this.area + "Nombre de pièces : " + this.RoomCounter + "Piscine ? " + this.swimming_pool);

    }
}
