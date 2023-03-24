package polymorphism.methodOverriding;

// POLYMORPHISM AND METHOD OVERRIDING

// Polymorphism refers to the ability of objects to take on multiple forms or
// behaviors. In OOP, polymorphism is achieved through method overloading and
// method overriding.

// Method overriding, on the other hand, allows a subclass to provide its own
// implementation of a method that is already defined in its superclass. This
// enables a subclass to customize or extend the behavior of its superclass.
// Example of method overriding (see App, Cat and Dog classes too):

public class Animal {
    public void speak() {
        System.out.println("An animal makes a sound");
    }
}
