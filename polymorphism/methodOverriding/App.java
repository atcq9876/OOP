package polymorphism.methodOverriding;

// POLYMORPHISM AND METHOD OVERRIDING

// Polymorphism refers to the ability of objects to take on multiple forms or
// behaviors. In OOP, polymorphism is achieved through method overloading and
// method overriding.

// Method overriding, on the other hand, allows a subclass to provide its own
// implementation of a method that is already defined in its superclass. This
// enables a subclass to customize or extend the behavior of its superclass.
// In this example of method overriding, Cat and Dog are child classes of Animal
// and so inherit the speak() method, but then respectively override this:

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        // prints "An animal makes a sound"
        animal.speak();
        // prints "Meow!"
        cat.speak();
        // prints "Woof!"
        dog.speak();
    }
}
