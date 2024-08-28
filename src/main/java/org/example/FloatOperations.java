package org.example;

public class FloatOperations {

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static int castToInt(float value) {
        return (int) value;
    }

    public static boolean doSomethingOrNot() {
        if (false) {
            System.out.println("Kura");
        }
        return true && true;
    }

    public static void main(String[] args) {
        float num1 = 5.5f;
        float num2 = 2.2f;

        float sum = add(num1, num2);
        float difference = subtract(num1, num2);
        float product = multiply(num1, num2);
        float quotient = divide(num1, num2);

        System.out.println("Sum: " + sum + ", Casted to int: " + castToInt(sum));
        System.out.println("Difference: " + difference + ", Casted to int: " + castToInt(difference));
        System.out.println("Product: " + product + ", Casted to int: " + castToInt(product));
        System.out.println("Quotient: " + quotient + ", Casted to int: " + castToInt(quotient));
    }
}