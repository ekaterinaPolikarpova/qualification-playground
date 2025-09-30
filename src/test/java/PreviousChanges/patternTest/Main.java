package PreviousChanges.patternTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int MIN_AGE = 20;
    public static int MAX_AGE = 100;
    public List<Worker> workerList;


    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        Qa qa = new Qa("Oleg", 25);
        Dev dev = new Dev("Ivan", 45);
        Qa oldQa = new Qa("Zoya", 120);
        Dev youngDev = new Dev("Anna", 5);
        List<Worker> wwList = Arrays.asList(qa, dev, oldQa, youngDev);

        List<Worker> nonProceedWorkers = Arrays.asList(qa, dev, oldQa, youngDev);

        List<Worker> proceedWorkers = calculateRange(nonProceedWorkers, MIN_AGE, MAX_AGE);
       // String vW = proceedWorkers.stream().

        for (Worker w: proceedWorkers){
            System.out.println(w.getName());
            System.out.println(w.getAge());
        }

        System.out.println("Валидные воркеры:");
    }







    public static List<Worker> calculateRange(List<Worker> nonProceedWorkers, int minAge, int maxAge) {
        List<Worker> validWorkers = new ArrayList<>();

        for (Worker w : nonProceedWorkers) {
            if (isValidWorker(w.getAge(), minAge, maxAge)) {
                validWorkers.add(w);
            }
        }
        return validWorkers;
    }

    public static boolean isValidWorker(int workerAge, int minAge, int maxAge) {
        return workerAge > minAge & workerAge < maxAge;
    }


}
