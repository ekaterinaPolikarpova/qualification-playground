package PreviousChanges.FabricTest;

public class Ios implements DeviceDrivers{

    private static Ios ios;

    @Override
    public void create(){
        System.out.println("create");
    }

    @Override
    public void close(){
        System.out.println("close");
    }
}
