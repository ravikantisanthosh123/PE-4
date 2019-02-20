package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest {
    ReplaceString rs=new ReplaceString();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replaceStringCharacters() {
        assertEquals("faity fry",rs.replaceStringCharacters("daily dry",'d','f','l','t'));
    }
    public void replaceStringCharacters2() {
        assertNotEquals("daity dry",rs.replaceStringCharacters("daily dry",'d','f','l','t'));
    }
}