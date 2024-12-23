package org.example.library;

public class Utility {
    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        return "Hello, " + name + "!";
    }
}