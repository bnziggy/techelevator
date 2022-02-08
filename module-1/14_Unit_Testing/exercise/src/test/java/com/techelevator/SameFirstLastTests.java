package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {

    SameFirstLast tests = new SameFirstLast();

    @Test
    public void test_for_123() {
        int[] testNums = {1,2,3};
        Assert.assertEquals("Should return false", false, tests.isItTheSame(testNums));
    }

    @Test
    public void test_for_1231() {
        int[] testNums = {1,2,3,1};
        Assert.assertEquals("Should return true", true, tests.isItTheSame(testNums));
    }

    @Test
    public void test_for_121() {
        int[] testNums = {1,2,1};
        Assert.assertEquals("Should return true", true, tests.isItTheSame(testNums));
    }

    @Test
    public void test_for_000() {
        int[] testNums = {0,0,0};
        Assert.assertEquals("Should return true", true, tests.isItTheSame(testNums));
    }
}
