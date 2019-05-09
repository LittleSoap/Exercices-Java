package exercice_4;

import java.util.Date;

public class File extends FileSystem {

    private String content;

    public File(String name, int size, Date creation_date, String content) {
        super(name, size, creation_date);
        this.content = content;
    }
}
