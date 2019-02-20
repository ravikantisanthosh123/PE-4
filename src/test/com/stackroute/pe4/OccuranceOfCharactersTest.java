package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceOfCharactersTest {
    OccuranceOfCharacters oc=new OccuranceOfCharacters();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void characterCount() {

        assertEquals(3,oc.characterCount("Java is java again java again",'v'));
    }
    @Test
    public void characterCountFailure() {

        assertNotEquals(6,oc.characterCount("Java is java again java again",'a'));
    }
}