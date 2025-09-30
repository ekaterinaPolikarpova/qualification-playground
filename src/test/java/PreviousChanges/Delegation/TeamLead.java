package PreviousChanges.Delegation;

public class TeamLead {

    public static void setTask(){
        WorkerTasks executor = new Manager();
        executor.call();
        WorkerTasks secExecutor = new Writer();
        secExecutor.write();
    }

    public static void main(String[] args) {
        setTask();
    }
}
