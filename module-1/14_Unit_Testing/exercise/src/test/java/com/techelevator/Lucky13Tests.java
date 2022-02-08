package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    Lucky13 tests = new Lucky13();

    @Test
    public void test_for_024() {
        int[] testNums = {0,2,4};
        Assert.assertEquals("Boolean should return true", true, tests.getLucky(testNums));
    }

    @Test
    public void test_for_123() {
        int[] testNums = {1,2,3};
        Assert.assertEquals("Boolean should return false", false, tests.getLucky(testNums));
    }

    @Test
    public void test_for_124() {
        int[] testNums = {1,2,4};
        Assert.assertEquals("Boolean should return false", false, tests.getLucky(testNums));
    }

    @Test
    public void test_for_000() {
        int[] testNums = {0,0,0};
        Assert.assertEquals("Boolean should return true", true, tests.getLucky(testNums));
    }

    @Test
    public void test_for_113() {
        int[] testNums = {1,1,3};
        Assert.assertEquals("Boolean should return false", false, tests.getLucky(testNums));
    }

    @Test
    public void test_for_444() {
        int[] testNums = {4,4,4};
        Assert.assertEquals("Boolean should return true", true, tests.getLucky(testNums));
    }
}
