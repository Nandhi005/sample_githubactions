
package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "Cannot divide by zero"
            );
        }

        return (double) a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Addition: " + app.add(10, 5));
        System.out.println("Subtraction: " + app.subtract(10, 5));
        System.out.println("Multiplication: " + app.multiply(10, 5));
        System.out.println("Division: " + app.divide(10, 5));
        System.out.println("Is 10 even? " + app.isEven(10));
    }
}
