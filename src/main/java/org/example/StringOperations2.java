package org.example;

public class StringOperations2 {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        String uppercased = toUpperCase(input);
        String lowercased = toLowerCase(input);

        System.out.println("Reversed: " + reversed);
        System.out.println("Uppercased: " + uppercased);
        System.out.println("Lowercased: " + lowercased);
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String toUpperCase(String str) {
        String uppercased = "";
        for (int i = 0; i < str.length(); i++) {
            uppercased += Character.toUpperCase(str.charAt(i));
        }
        return uppercased;
    }

    public static String toLowerCase(String str) {
        String lowercased = "";
        for (int i = 0; i < str.length(); i++) {
            lowercased += Character.toLowerCase(str.charAt(i));
        }
        return lowercased;
    }
}