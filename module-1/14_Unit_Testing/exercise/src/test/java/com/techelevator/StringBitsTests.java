package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {

    StringBits tests = new StringBits();

    @Test
    public void test_for_hello() {
        Assert.assertEquals("Should return Hlo", "Hlo", tests.getBits("Hello"));
    }

    @Test
    public void test_for_hi() {
        Assert.assertEquals("Should return H", "H", tests.getBits("Hi"));
    }

    @Test
    public void test_for_Heeololeo() {
        Assert.assertEquals("Should return Hello", "Hello", tests.getBits("Heeololeo"));
    }

    @Test
    public void test_for_one() {
        Assert.assertEquals("Should return H", "H", tests.getBits("H"));
    }

    @Test
    public void test_for_null() {
        Assert.assertEquals("Should return empty string", "", tests.getBits(""));
    }
}
