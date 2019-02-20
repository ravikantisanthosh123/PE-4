package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose st=new StringTranspose();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transposeofWords() {
        assertEquals("ym eman si hsohtnas", st.transposeofWords("my name is santhosh"));
    }
    @Test
    public void transposeofWordsFailure() {
        assertNotEquals("ym eman si hsohtnad",st.transposeofWords("my name is santhosh"));

    }
}