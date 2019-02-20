package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurancesTest {

    MultipleOccurances mo=new MultipleOccurances();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multipleOccurancesFunction() {

        String[] output={"Found at: 4 - 6","Found at: 10 - 12","Found at: 27 - 29"};
        assertArrayEquals(output,mo.multipleOccurancesFunction("She sells seashells by the seashore","se"));

    }
    @Test
    public void multipleOccurancesFunctionFailure() {

        String[] output={"Found at: 5 - 6","Found at: 8 - 12","Found at: 27 - 29"};
        assertNotEquals(output,mo.multipleOccurancesFunction("She sells seashells by the seashore","se"));
       // assertEquals(output,mo.multipleOccurancesFunction("She sells seashells by the seashore","se"));


    }
}