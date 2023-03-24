package encapsulation;

// ENCAPSULATION

// Encapsulation is the practice of keeping the internal state of an object
// hidden from the outside world and allowing access to it only through
// well-defined methods. In other words, encapsulation is a way to control
// access to an object's properties and methods.

// In example below, we have a Car class with private instance variables for the
// car's make, model, and year. The class also has public getters and setters
// for each of these variables. The start() and stop() methods are public
// methods that can be called to start and stop the car.

// By making the instance variables private and only allowing access to them
// through getter and setter methods, we are encapsulating the data and ensuring
// that it can only be modified in a controlled manner. This helps to prevent
// errors and make the code more reliable.

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start() {
        System.out.println("The " + make + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println("The " + make + " " + model + " is stopping.");
    }
}
