package pt4.task2;

public class Calculator {
    public double calculateTotal(double price, int quantity, double taxRate) {
        double subtotal = price * quantity;
        double taxAmount = subtotal * taxRate / 100;
        return subtotal + taxAmount;
    }
}
