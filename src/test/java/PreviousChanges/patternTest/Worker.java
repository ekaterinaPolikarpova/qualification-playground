package PreviousChanges.patternTest;

public abstract class Worker implements Operatable {
    private String name;
    private int age;


    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
