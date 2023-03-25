import src.Monitor;
import src.drive.Drive;
import src.drive.HDDDrive;
import src.drive.SSDDrive;
import src.file.File;
import src.file.imagefile.GIFImageFile;
import src.file.imagefile.JPGImageFile;
import src.usbdevice.MemoryStick;
import src.usbdevice.Mouse;
import src.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile mp3 = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);
        Drive drive = new HDDDrive();
        drive.AddFile(gif1);
        drive.AddFile(jpg1);
        drive.AddFile(mp3);

        drive.ListFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

    }
}