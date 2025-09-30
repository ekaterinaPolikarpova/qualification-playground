package PreviousChanges.Singleton;

public class Dog {

    private static Dog dog;

    private Dog() {
    }

    public static Dog getInstance() {
        if (dog == null) {
            System.getLogger("instance is creating");
            return dog = new Dog();
        } else {
            return dog;
        }
    }

    public static void main(String[] args) {
        getInstance();
    }
}
