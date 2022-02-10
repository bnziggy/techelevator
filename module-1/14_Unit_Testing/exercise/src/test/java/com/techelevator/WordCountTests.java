package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTests {

    WordCount tests = new WordCount();

    @Test
    public void test_for_ba_ba_black_sheep() {

        WordCount wc = new WordCount();
        String[] testArray = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);

        Map<String, Integer> actual = wc.getCount(testArray);
        Assert.assertEquals("Incorrect array returned", expected, actual);
    }

    @Test
    public void test_for_abacb() {
        String[] testArray = {"a","b","a","c","b"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a",2);
        expected.put("b",2);
        expected.put("c",1);
        Assert.assertEquals("Incorrect array returned", expected, tests.getCount(testArray));
    }

    @Test
    public void test_for_empty_array() {
        String[] testArray = {};
        Map<String,Integer> expected = new HashMap<>();
        Assert.assertEquals("Array should be empty", expected, tests.getCount(testArray));
    }

    @Test
    public void test_for_7_z() {
        String[] testArray = {"z","z","z","z","z","z","z"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("z", 7);
        Assert.assertEquals("Incorrect array returned", expected, tests.getCount(testArray));
    }
}
