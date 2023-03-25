package src;

public class Monitor {
    private int width = 3840;
    private int height= 1920;
    public void SetLowResolution(){
        width = 800;
        height = 600;
    }
    public void SetHighResolution(){
        width = 3840;
        height = 1920;
    }
    public String GetResolution(){
        return width + "x" + height;
    }




}
