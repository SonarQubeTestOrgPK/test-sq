package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public static BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static BigDecimal divide(BigDecimal a, BigDecimal b, int scale) {
        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a.divide(b, scale, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("2.3");

        System.out.println("Add: " + add(num1, num2));
        System.out.println("Subtract: " + subtract(num1, num2));
        System.out.println("Multiply: " + multiply(num1, num2));
        System.out.println("Divide: " + divide(num1, num2, 2));
    }
}