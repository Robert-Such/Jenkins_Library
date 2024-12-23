package org.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void testGreetWithJenkinsParameter() {
        String name = System.getenv("TEST_NAME"); // Get the parameter from Jenkins
        if (name == null || name.isBlank()) {
            assertThrows(IllegalArgumentException.class, () -> Utility.greet(name));
        } else {
            assertEquals("Hello, " + name + "!", Utility.greet(name));
        }
    }
}


