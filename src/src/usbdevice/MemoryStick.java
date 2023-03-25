package src.usbdevice;

public class MemoryStick implements USBDevice{
    private  String name;
    private boolean ejected = false;
    public MemoryStick(String name) {
        this.name = name;

    }
    @Override
    public boolean connect() {
        System.out.println("Connected Memory Stick");
        return true;
    }
    public void Eject(){
        System.out.println("Ejecting Memory Stick");
        ejected = true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Please eject Memory Stick first");
            return false;
        } else {
            System.out.println("Memory stick is disconnected");
            return true;
        }
    }

    @Override
    public String getName() {
        return null;
    }
}
