package org.example.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void testGreetWithEnvironmentVariable() {
        String name = System.getProperty("TEST_NAME");
            assertEquals("Hello, World!", Utility.greet(name));
    }
}


