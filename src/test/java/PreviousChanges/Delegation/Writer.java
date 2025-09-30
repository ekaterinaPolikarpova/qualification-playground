package PreviousChanges.Delegation;

public class Writer implements WorkerTasks{
    public Writer() {
    }

    @Override
    public void write() {
        System.out.println("Writer is writing");
    }

    @Override
    public void text() {
        System.out.println("Writer is texting");
    }

    @Override
    public void call() {
        System.out.println("Writer is calling");
    }
}
