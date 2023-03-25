package src.file.imagefile;

import src.file.File;
import src.file.FileType;

public class JPGImageFile extends AbstractImageFile {

    private int compression;

    public JPGImageFile(String name, int size,  int compression) {
       super(name,size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void DisplayImage(){

        System.out.println("Displaying JPG");
    }
}
