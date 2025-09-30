package PreviousChanges.FabricTest;

public class TestOfFabMethod {

    public static void driverInit(OSType osType){
       DeviceDrivers deviceDriver = DriverFactory.createDriver(osType);
        deviceDriver.close();
        deviceDriver.create();
    }

    public static void main(String[] args) {
        driverInit(OSType.IOS);
        driverInit(OSType.ANDROID);
    }
}
