package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {

    CigarParty tests = new CigarParty();

    //Test cigar party scenarios
    @Test
    public void test_for_39_is_false() {
        Assert.assertEquals("Returned boolean is incorrect", false, tests.haveParty(39, false));
    }

    @Test
    public void test_for_inbounds_during_week() {
        Assert.assertEquals("Boolean returned is incorrect", true, tests.haveParty(50, false));
    }

    @Test
    public void test_for_over_60_weekday() {
        Assert.assertEquals("Boolean returned is incorrect", false, tests.haveParty(61,false));
    }

    @Test
    public void test_for_over_60_weekend() {
        Assert.assertEquals("Boolean returned is incorrect", true, tests.haveParty(61,true));
    }

    @Test
    public void test_for_0() {
        Assert.assertEquals("Boolean returned is inccorect", false, tests.haveParty(0, false));
    }
}
