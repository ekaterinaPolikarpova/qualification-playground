package PreviousChanges.FabricTest;

public class Android implements DeviceDrivers {

    public static Android android;

    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}

