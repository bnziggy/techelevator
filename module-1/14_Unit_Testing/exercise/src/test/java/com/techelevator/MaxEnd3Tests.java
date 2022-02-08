package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {

    MaxEnd3 tests = new MaxEnd3();

    private void assertEqualsArray(String string, int[] expected, int[] makeArray) {

    }

    @Test
    public void test_for_123() {
        int[] testNums = {1,2,3};
        int[] expected = {3,3,3};
        assertEqualsArray("Should return 3,3,3", expected, tests.makeArray(testNums));
    }

    @Test
    public void test_for_11_5_9() {
        int[] testNums = {11,5,9};
        int[] expected = {11,11,11};
        assertEqualsArray("Should return 11,11,11", expected, tests.makeArray(testNums));
    }

    @Test
    public void test_for_2_11_3() {
        int[] testNums = {2,11,3};
        int[] expected = {3,3,3};
        assertEqualsArray("Should return 3,3,3", expected, tests.makeArray(testNums));
    }

    @Test
    public void test_for_000() {
        int[] testNums = {0,0,0};
        int[] expected = {0,0,0};
        assertEqualsArray("Should return 0,0,0", expected, tests.makeArray(testNums));
    }
}
