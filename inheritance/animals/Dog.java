package inheritance.animals;

// INHERITANCE

// Inheritance refers to the ability of a subclass to inherit the properties and
// methods of its superclass. This allows for code reuse and can help to reduce
// redundancy in a program.
// Below is an example of this. In this example, the Animal class defines the
// basic properties and behaviors of all animals, which the Dog class inherits
// but also adds additional properties and behaviors specific to dogs.

class Dog extends Animal {
    public Dog() {
        super("dog");
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void wagTail() {
        System.out.println("The dog is wagging its tail.");
    }
}
