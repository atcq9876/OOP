package encapsulation;

// ENCAPSULATION

// Encapsulation is the practice of keeping the internal state of an object
// hidden from the outside world and allowing access to it only through
// well-defined methods. In other words, encapsulation is a way to control
// access to an object's properties and methods.

// In the example below, the BankAccount class has a private instance variable
// balance. This variable is not accessible outside the class, so the internal
// state of the BankAccount object is hidden from users.

// To interact with the balance variable, the class provides two public methods
// deposit() and withdraw(). These methods allow external code to modify the
// balance variable in a controlled manner. For example, the withdraw() method
// checks whether the requested amount is greater than the current balance and
// throws an exception if it is.

// The getBalance() method is another example of encapsulation. It provides
// read-only access to the balance variable, allowing external code to see the
// current balance of the BankAccount object without being able to modify it
// directly.

// In this way, encapsulation helps to ensure that the internal state of an
// object is not accidentally or maliciously modified by external code. By
// providing well-defined methods for accessing and modifying the object's
// state, encapsulation allows for greater control over the behavior of the
// object and helps to maintain the integrity of the system as a whole.

public class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
