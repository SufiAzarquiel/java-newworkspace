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
        oRun.setA(1);
        assertEquals(oRun.getA(), 1);
    }
}
