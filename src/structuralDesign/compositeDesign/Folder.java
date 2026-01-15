package structuralDesign.compositeDesign;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Folder implements FileSystem{
    private String name;
    List<FileSystem> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void setFile(FileSystem file) {
        files.add(file);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder : " + name);
        for(FileSystem f : files) {
            f.showDetails();
        }
    }
}
