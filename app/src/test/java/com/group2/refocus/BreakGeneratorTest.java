package com.group2.refocus;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BreakGeneratorTest {

    private BreakGenerator breakGenerator;

    @Before
    public void setUp() {
        breakGenerator = new BreakGenerator();
    }

    @Test
    public void testGetList() {
        assertFalse(breakGenerator.getList().isEmpty());
    }

    @Test
    public void testGetBreakByTime() {
        Break break5 = breakGenerator.getBreak(5);
        assertNotNull(break5);
        assertEquals(5, break5.getTime());

        Break break15 = breakGenerator.getBreak(15);
        assertNotNull(break15);
        assertEquals(15, break15.getTime());

        Break break30 = breakGenerator.getBreak(30);
        assertNotNull(break30);
        assertEquals(30, break30.getTime());
    }

    @Test
    public void testGetBreakByActivity() {
        String testActivity = "Stretch your arms, neck, and legs";
        Break foundBreak = breakGenerator.getBreak(testActivity);

        assertNotNull(foundBreak);
        assertEquals(testActivity, foundBreak.getBreakActivity());
    }

    @Test
    public void testGetBreakByActivityNotFound() {
        Break nonExistentBreak = breakGenerator.getBreak("Non-existent activity");
        assertEquals(0, nonExistentBreak.getTime());
        assertEquals("", nonExistentBreak.getBreakActivity());
    }

}
