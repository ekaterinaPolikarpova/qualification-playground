package PreviousChanges.FabricTest;

public class DriverFactory {

    public static DeviceDrivers createDriver(OSType osType) {
        switch (osType) {
            case IOS:
                return new Ios();
            case ANDROID:
                return new Android();
            default:
               throw new IllegalArgumentException("unsupported driver type");
        }
    }
}