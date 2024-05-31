package InterfaceAbstraction;

public interface PaymentProcessor {
    //Hiding the implementation details
    void processPayment(double amount);
}
