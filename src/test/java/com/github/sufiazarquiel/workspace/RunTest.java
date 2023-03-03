package com.github.sufiazarquiel.workspace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.github.sufiazarquiel.workspace.oneFilers.OOP1Homework;

/**
 * Unit-level testing for {@link Run} object.
 */
public class RunTest {
    @Test
    public void classTest() {
        Run oRun = new Run();
        assertEquals(0, oRun.getValue());
        assertEquals(12.153, OOP1Homework.redondear(12.153123, 3));
        assertEquals(123.152, OOP1Homework.redondear(123.152, 4));
    }
}
