package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    NonStart tests = new NonStart();

    @Test
    public void test_for_Hello_There() {
        Assert.assertEquals("Should return ellohere", "ellohere", tests.getPartialString("Hello", "There"));
    }

    @Test
    public void test_for_java_code() {
        Assert.assertEquals("Should return avaode", "avaode", tests.getPartialString("java", "code"));
    }

    @Test
    public void test_for_shotl_java() {
        Assert.assertEquals("Should return hotlava", "hotlava", tests.getPartialString("shotl","java"));
    }

    @Test
    public void test_for_empty_string() {
        Assert.assertEquals("Should return empty string", "", tests.getPartialString("",""));
    }
}
