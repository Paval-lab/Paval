// Parent class
class Inheritanceexample {
    // Method to be inherited
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from the parent class
class Dog extends Inheritanceexample {
    // Method specific to the Dog class
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Main class to demonstrate the inheritance
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog d = new Dog();

        // Call the inherited eat() method from the parent class
        d.eat();

        // Call the Dog's specific bark() method
        d.bark();
    }
}