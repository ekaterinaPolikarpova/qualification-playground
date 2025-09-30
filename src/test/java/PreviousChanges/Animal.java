package PreviousChanges;

public class Animal {
    private String type;
    private String name;
    private int age;
    private String ownerName;

    private Animal() {
    }

    public static BuilderAnimal builder() {
        return new BuilderAnimal();
    }

    public static class BuilderAnimal {
        private String type;
        private String name;
        private int age;
        private String ownerName;

        public BuilderAnimal type(String type) {
            this.type = type;
            return this;
        }

        public BuilderAnimal name(String name) {
            this.name = name;
            return this;
        }

        public BuilderAnimal age(int age) {
            this.age = age;
            return this;
        }

        public BuilderAnimal ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Animal build() {
            Animal animal = new Animal();
            animal.age = this.age;
            animal.name = this.name;
            animal.ownerName = this.ownerName;
            animal.type = this.type;
            return animal;
        }
    }

    public void print() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Владелец:" + ownerName);
        System.out.println("Тип:" + type);
    }
}
