package PreviousChanges.DesignPatternPractice;

public class GeneralClass {
    private static GeneralClass generalClass;

    private GeneralClass() {
    }

    public static GeneralClass getInstance() {

        if (generalClass == null) {
            generalClass = new GeneralClass();
        }
        return generalClass;
    }
}
