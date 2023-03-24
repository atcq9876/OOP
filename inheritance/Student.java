package inheritance;

// INHERITANCE

// Inheritance refers to the ability of a subclass to inherit the properties and
// methods of its superclass. This allows for code reuse and can help to reduce
// redundancy in a program.
// Below is an example of this (also see App and Person classes):

public class Student extends Person {
    private int year;

    Student(String name, int age, int year) {
        // super is used to call the constructor or a method of the superclass
        super(name, age);
        this.year = year;
    }

    public void introduce() {
        // super is used to call the constructor or a method of the superclass
        super.introduce();
        System.out.printf("I am a student in year %d\n", this.year);
    }
}
