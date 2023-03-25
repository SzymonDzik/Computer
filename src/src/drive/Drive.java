package src.drive;

import src.file.File;

public interface Drive {
    void AddFile(File file);
    void ListFiles();
    File findFile(String name);
}
