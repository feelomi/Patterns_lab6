package pt2.task1;

public class Employee {
    private String name;
    private double salary;

    // Конструктор та інші методи класу...

    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary() + amount);
        }
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}