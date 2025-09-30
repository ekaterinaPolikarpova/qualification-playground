package PreviousChanges;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = Animal.builder()
                .ownerName("kll")
                .age(11)
                .type("Dog")
                .name("name")
                .build();
        Animal cat = Animal.builder()
                .type("Cat")
                .age(22)
                .build();

        cat.print();
        dog.print();
    }


}
