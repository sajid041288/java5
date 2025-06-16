// Abstract class to demonstrate Abstraction
abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {  // Encapsulation
        return brand;
    }

    public abstract void start();  // Abstract method
}

// Car class demonstrating Inheritance and Polymorphism
class Car extends Vehicle {

    private String model;
    public Car(String brand, String model) {

        super(brand);  // Calling parent class constructor

        this.model = model;

    }

    // Overriding abstract method (Polymorphism)
    @Override
    public void start() {
        System.out.println(getBrand() + " " + model + " is starting with a key.");
    }

    // Method Overloading
    public void start(String mode) {
        System.out.println(getBrand() + " " + model + " is starting in " + mode + " mode.");
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");  // Object Creation
        myCar.start();                   // Polymorphism - Overridden method
        myCar.start("Eco");              // Polymorphism - Overloaded method
    }
}
