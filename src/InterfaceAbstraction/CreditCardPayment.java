package InterfaceAbstraction;

public class CreditCardPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        if (amount == 15000) {
            System.out.println("Credit card Payment done");
        } else if (amount >= 10000) {
            System.out.println("Partial Payment done");
        } else if (amount <= 5000) {
            System.out.println("Please pay the Credit bill");
        }
    }
}
