package pt4.task13;

public class Calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Ділення на нуль");
        }
        return dividend / divisor;
    }
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат ділення: " + result);
        }catch (ArithmeticException e){
            System.out.println("Помилка: Ділення на нуль");
        }
    }
}