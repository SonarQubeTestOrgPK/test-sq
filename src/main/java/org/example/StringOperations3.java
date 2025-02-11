package org.example;

public class StringOperations3 {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        String uppercased = toUpperCase(input);
        String uppercased2 = toUpperCase(input);
        String lowercased = toLowerCase(input);

        System.out.println("Reversed: " + reversed);
        System.err.println("Eeeeeeeeeefds: " + lowercased);
        System.err.println("EEEEEEEEE: " + lowercased);


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