package exercice_4;
import java.util.Date;
import java.util.List;

public class Directory extends FileSystem{

    private List<FileSystem> content;

    public Directory(String name, int size, Date creation_date) {
        super(name, size, creation_date);
    }

    public void addToDirectory(FileSystem fs){
        content.add(fs);
        this.size += fs.getSize();
    }

    public void removeFromDirectory(FileSystem fs){
        content.remove(fs);
        this.size -= fs.getSize();
    }

    @Override
    public void print() {
        
    }
}
