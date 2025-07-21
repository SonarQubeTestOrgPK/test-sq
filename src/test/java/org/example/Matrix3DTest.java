package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Matrix3DTest {

    @Test
    public void testSetAndGetElement() {
        Matrix3D matrix = new Matrix3D(2, 2, 2);
        matrix.setElement(0, 0, 0, 5);
        assertEquals(5, matrix.getElement(0, 0, 0));
    }

    @Test
    public void testAdd() {
        Matrix3D a = new Matrix3D(1, 2, 2);
        Matrix3D b = new Matrix3D(1, 2, 2);
        a.setElement(0, 0, 0, 1);
        a.setElement(0, 0, 1, 2);
        a.setElement(0, 1, 0, 3);
        a.setElement(0, 1, 1, 4);

        b.setElement(0, 0, 0, 5);
        b.setElement(0, 0, 1, 6);
        b.setElement(0, 1, 0, 7);
        b.setElement(0, 1, 1, 8);

        Matrix3D result = a.add(b);
        assertEquals(6, result.getElement(0, 0, 0));
        assertEquals(8, result.getElement(0, 0, 1));
        assertEquals(10, result.getElement(0, 1, 0));
        assertEquals(12, result.getElement(0, 1, 1));
    }

    @Test
    public void testSubtract() {
        Matrix3D a = new Matrix3D(1, 1, 2);
        Matrix3D b = new Matrix3D(1, 1, 2);
        a.setElement(0, 0, 0, 10);
        a.setElement(0, 0, 1, 5);
        b.setElement(0, 0, 0, 3);
        b.setElement(0, 0, 1, 2);

        Matrix3D result = a.subtract(b);
        assertEquals(7, result.getElement(0, 0, 0));
        assertEquals(3, result.getElement(0, 0, 1));
    }

    @Test
    public void testMultiply() {
        Matrix3D a = new Matrix3D(1, 1, 2);
        Matrix3D b = new Matrix3D(1, 1, 2);
        a.setElement(0, 0, 0, 2);
        a.setElement(0, 0, 1, 3);
        b.setElement(0, 0, 0, 4);
        b.setElement(0, 0, 1, 5);

        Matrix3D result = a.multiply(b);
        assertEquals(8, result.getElement(0, 0, 0));
        assertEquals(15, result.getElement(0, 0, 1));
    }

    @Test
    public void testDimensionMismatch() {
        Matrix3D a = new Matrix3D(1, 2, 2);
        Matrix3D b = new Matrix3D(2, 2, 2);
        assertThrows(IllegalArgumentException.class, () -> a.add(b));
        assertThrows(IllegalArgumentException.class, () -> a.subtract(b));
        assertThrows(IllegalArgumentException.class, () -> a.multiply(b));
    }
}