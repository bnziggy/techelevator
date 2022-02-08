package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {

    Less20 tests = new Less20();

    @Test
    public void test_for_18() {
        Assert.assertEquals("Boolean should return true", true, tests.isLessThanMultipleOf20(18));
    }

    @Test
    public void test_for_19() {
        Assert.assertEquals("Boolean should return true", true, tests.isLessThanMultipleOf20(19));
    }

    @Test
    public void test_for_20() {
        Assert.assertEquals("Boolean should return false", false, tests.isLessThanMultipleOf20(20));
    }

    @Test
    public void test_for_21() {
        Assert.assertEquals("Boolean should return false", false, tests.isLessThanMultipleOf20(21));
    }

    @Test
    public void test_for_38() {
        Assert.assertEquals("Boolean should return true", true, tests.isLessThanMultipleOf20(38));
    }

    @Test
    public void test_for_40() {
        Assert.assertEquals("Boolean should return false", false, tests.isLessThanMultipleOf20(40));
    }
}
