package inheritance.animals;

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }

    public void sleep() {
        System.out.println("The " + species + " is sleeping.");
    }
}
