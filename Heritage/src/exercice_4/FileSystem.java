package exercice_4;

import java.util.Date;

public class FileSystem {

    protected String name;
    protected int size;
    protected Date creation_date;

    public FileSystem(){};

    public FileSystem(String name, int size, Date creation_date) {
        this.name = name;
        this.size = size;
        this.creation_date = creation_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }


}
