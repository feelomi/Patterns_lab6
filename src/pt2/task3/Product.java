package pt2.task3;

public class Product {
    private String name;
    private double price;
    private Currency currency;

    // Конструктор та інші методи класу...

    public Product(String name, double price, Currency currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Currency getCurrency() {
        return currency;
    }
    // Інші методи класу...
}