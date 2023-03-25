package src.file.imagefile;

import src.file.AbstractFile;
import src.file.File;
import src.file.FileType;

public abstract class  AbstractImageFile extends AbstractFile {
    protected AbstractImageFile(String name, int size) {
        super(name,size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
