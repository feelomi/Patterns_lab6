package pt2.task15;

public class Shape {
    protected double radius;
    protected double width;
    protected double height;

    public Shape(double radius, double width, double height) {
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    // Інші поля та методи
    public double getArea() {
        return 0; // Заглушка
    }
    public double getPerimeter() {
        return 0; // Заглушка
    }
}