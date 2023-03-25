package src.drive;

import src.file.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {
   private Map<String, File> files = new HashMap<>();

    @Override
    public void AddFile(File file) {
        files.put(file.getName(), file);

    }

    @Override
    public void ListFiles() {
        Collection<File> fileCollection = files.values();
        for(File file : fileCollection)
        {
            System.out.println(file.getName());
        }

    }

    @Override
    public File findFile(String name) {

        return files.get(name);
    }
}
