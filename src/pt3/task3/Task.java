package pt3.task3;

public class Task {
    public void processOrder(int quantity, double price) {
        if (quantity > 10 || price > 100) {
            applyDiscount();
        }
        if (quantity > 10) {
            // Операція 1
        } else {
            // Операція 1
        }
        if (price > 100) {
            // Операція 2
        } else {
            // Операція 2
        }
    }

    private void applyDiscount() {
    }
}