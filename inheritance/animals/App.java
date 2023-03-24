package inheritance.animals;

// INHERITANCE

// Inheritance refers to the ability of a subclass to inherit the properties and
// methods of its superclass. This allows for code reuse and can help to reduce
// redundancy in a program.
// Below is an example of this:

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
