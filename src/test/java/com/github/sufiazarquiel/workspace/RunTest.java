package com.github.sufiazarquiel.workspace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link Run} object.
 */
public class RunTest {
    @Test
    public void classTest() {
        Run oRun = new Run();
        assertEquals(0, oRun.getValue());
    }
}
