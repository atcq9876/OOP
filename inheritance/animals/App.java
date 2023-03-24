package inheritance.animals;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Rhino");
        Dog dog = new Dog();

        animal.eat();
        dog.eat();
        dog.bark();
    }
}
