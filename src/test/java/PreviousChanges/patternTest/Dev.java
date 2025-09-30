package PreviousChanges.patternTest;

public class Dev extends Worker {
    public Dev(String name, int age) {
        super(name, age);
    }

    @Override
    public void operate() {
        System.out.println("Operate Dev");
    }
}
