package com.example.JaCoCo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessages {

    @Test
    void testName() {
        Messages msg = new Messages();
        assertEquals("Hello Michael!", msg.getMessage("Michael"));
        assertEquals("Please provide a name", msg.getMessage("     "));
        assertEquals("Please provide a name", msg.getMessage(null));

        assertThat(msg.getMessage("     ")).isEqualTo("Please provide a name");
    }

}
