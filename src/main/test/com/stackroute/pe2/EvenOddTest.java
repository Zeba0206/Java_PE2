package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd evenObj;
    @Before
    public void setUp() throws Exception {
        evenObj=new EvenOdd();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {
        Boolean booleanOP=evenObj.isEven(25);
        assertEquals(false,booleanOP);

    }

    @Test
    public void TestIsInteger()
    {
        //act
        boolean bint=evenObj.testIsInteger();
        //assert
        assertEquals(false,bint);
    }
}
