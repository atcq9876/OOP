package inheritance;

// INHERITANCE

// Inheritance refers to the ability of a subclass to inherit the properties and
// methods of its superclass. This allows for code reuse and can help to reduce
// redundancy in a program.
// Below is an example of this (also see App and Student classes):

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old\n", this.name, this.age);
    }
}
