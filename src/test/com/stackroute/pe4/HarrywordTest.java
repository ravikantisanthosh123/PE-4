package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarrywordTest {
    Harryword hw=new Harryword();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findHarryword() {
        assertEquals("Is Harry here ? true",hw.FindHarryword("This is Harry","Harry"));
    }
    @Test
    public void findHarrywordFailure() {
        assertNotEquals("Is Harry here ? false",hw.FindHarryword("This is Harry","Harry"));
    }
}