package inheritance.animals;

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
