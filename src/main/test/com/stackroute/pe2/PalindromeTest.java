package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome object1;

    @Before
    public void setUp() throws Exception {
        object1=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseStr() {

        assertEquals("abez",object1.reverseStr("zeba"));
    }

    @Test
    public void checkNull() {
        assertNotNull(object1);
    }

    @Test
    public void isPalindrome() {
        assertEquals(false,object1.isPalindrome("aba"));
    }
}