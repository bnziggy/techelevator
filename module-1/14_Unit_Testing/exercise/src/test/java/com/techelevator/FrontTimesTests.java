package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {

    FrontTimes tests = new FrontTimes();

    @Test
    public void test_for_2_chocolate() {
        Assert.assertEquals("Does not return ChoCho", "ChoCho", tests.generateString("Chocolate",2));
    }

    @Test
    public void test_for_3_chocolate() {
        Assert.assertEquals("Does not return ChoChoCho", "ChoChoCho", tests.generateString("Chocolate", 3));
    }

    @Test
    public void test_for_3_ABC() {
        Assert.assertEquals("Does not return ABCABCABC", "ABCABCABC", tests.generateString("ABC", 3));
    }

    @Test
    public void test_for_2_null() {
        Assert.assertEquals("Should return empty string", "", tests.generateString(null, 2));
    }
    @Test
    public void test_for_0_chocolate() {
        Assert.assertEquals("Should return empty string", "", tests.generateString("Chocolate", 0));
    }
}
