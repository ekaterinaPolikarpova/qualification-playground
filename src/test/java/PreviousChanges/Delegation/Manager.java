package PreviousChanges.Delegation;

public class Manager implements WorkerTasks{
    public Manager() {
    }

    @Override
    public void write() {
        System.out.println("Manager is writing");
    }

    @Override
    public void text() {
        System.out.println("Manager is texting");
    }

    @Override
    public void call() {
        System.out.println("Manager is calling");
    }
}
