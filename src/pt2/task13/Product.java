package pt2.task13;

public abstract class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract void process();

    public String getName() {
        return name;
    }
}