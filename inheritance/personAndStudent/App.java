package inheritance;

// INHERITANCE

// Inheritance refers to the ability of a subclass to inherit the properties and
// methods of its superclass. This allows for code reuse and can help to reduce
// redundancy in a program.
// Below is an example of this - the Student class is a subclass of the Person
// and so inherits the constructor and introduce() method of the Person
// superclass. However, it then overrides these by changing their implementation
// though by using "super" it is able to inherit the superclass' constructor,
// instance variables and methods within its new constructor and method.

public class App {
    public static void main(String[] args) {
        Person person = new Person("James", 20);
        Student student = new Student("Amy", 16, 11);
        // Only mentions name and age
        person.introduce();
        // Mentions name and age, followed by school year
        student.introduce();
    }
}
