package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAlphabetTest {
    SortAlphabet sa=new SortAlphabet();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortAlphabetWords() {
        assertEquals("aaagjmoprrv",sa.sortAlphabetWords("java             program"));
    }

    @Test
    public void sortAlphabetWordsFailure() {
        assertNotEquals("aaagjmoprrd",sa.sortAlphabetWords("java             program"));
    }
}