package Abstraction;

public abstract class Car {

    //Hiding implementation details - The abstract methods (Method without implementation) are implemented
    //in subclass of an abstract class. Which means subclass extends the abstract class.
    public abstract void start();
    public abstract void stop();
    public abstract void drive();

    //Focusing on What, Not How - The abstract class focuses on what a car can
    // do (start, stop, drive) rather than how these actions are performed. This allows different types of cars like Sedan, SUV, Benz, Audi, etc.,

    //Providing a Contract -
    //By defining an abstract class, a contract is established that any subclass (like Sedan) must implement the start(), stop(), and drive() methods.
    // This ensures that all cars have the same basic behaviors, even if the implementation differs

}
