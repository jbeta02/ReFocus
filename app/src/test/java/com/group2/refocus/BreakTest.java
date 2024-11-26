package com.group2.refocus;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class BreakTest {

    private Break testBreak;

    @Before
    public void setUp() {
        testBreak = new Break(5, "Stretch your arms, neck, and legs");
    }

    @Test
    public void testConstructor() {
        assertEquals(5, testBreak.getTime());
        assertEquals("Stretch your arms, neck, and legs", testBreak.getBreakActivity());
    }

    @Test
    public void testSettersAndGetters() {
        testBreak.setTime(15);
        assertEquals(15, testBreak.getTime());

        testBreak.setBreakActivity("Do a creative activity");
        assertEquals("Do a creative activity", testBreak.getBreakActivity());
    }

}
