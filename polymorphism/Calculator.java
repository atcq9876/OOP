package polymorphism;

// POLYMORPHISM AND METHOD OVERLOADING

// Polymorphism refers to the ability of objects to take on multiple forms or
// behaviors. In OOP, polymorphism is achieved through method overloading and
// method overriding.

// Method overloading allows a class to have multiple methods with the same
// name, but different parameters. This enables a single method name to be used
// for multiple tasks, which makes code more readable and reduces complexity.
// Example of method overloading:

public class Calculator {
    public Integer add(int x, int y) {
        return x + y;
    }
    
    public Integer add(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        // code to be executed
        Calculator calc = new Calculator();
        int result1 = calc.add(1, 2);
        System.out.println(result1);
        int result2 = calc.add(3, 4, 5);
        System.out.println(result2);
    }
}
