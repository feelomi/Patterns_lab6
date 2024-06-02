package pt3.task2;

public class Task {
    public void processPayment(double amount, boolean isMember, boolean isDiscountAvailable) {
        boolean shouldApplyDiscount = (amount > 100 && isMember) || (amount > 200 && isDiscountAvailable);
        if (shouldApplyDiscount) {
            applyDiscount();
        }
    }

    private void applyDiscount() {
    }
}