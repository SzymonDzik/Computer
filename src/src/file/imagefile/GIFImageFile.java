package src.file.imagefile;



public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(String name, int size){

        super(name,size);
    }

    public void ShowAnimation(){

        System.out.println("Showing funny GIF");
    }
}
