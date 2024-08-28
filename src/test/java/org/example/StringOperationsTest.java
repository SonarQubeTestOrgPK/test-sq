package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringOperationsTest {

    @Test
    public void testReverseString() {
        assertEquals("dlroW olleH", StringOperations.reverseString("Hello World"));
        assertEquals("avaJ", StringOperations.reverseString("Java"));
        assertEquals("", StringOperations.reverseString(""));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO WORLD", StringOperations.toUpperCase("Hello World"));
        assertEquals("JAVA", StringOperations.toUpperCase("Java"));
        assertEquals("", StringOperations.toUpperCase(""));
    }

    @Test
    public void testToLowerCase() {
        assertEquals("hello world", StringOperations.toLowerCase("Hello World"));
        assertEquals("java", StringOperations.toLowerCase("Java"));
        assertEquals("", StringOperations.toLowerCase(""));
    }
}