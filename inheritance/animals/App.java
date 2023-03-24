package inheritance.animals;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("rhino");
        Dog dog = new Dog();

        animal.eat();
        // Dog inherits the eat() method from Animal
        dog.eat();
        // Dog has its own method bark(), animal can't call it
        dog.bark();
    }
}
