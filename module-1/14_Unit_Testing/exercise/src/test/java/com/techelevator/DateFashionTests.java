package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {

    DateFashion tests = new DateFashion();

    @Test
    public void your_style_2_or_less_date_is_8() {
        Assert.assertEquals("You do not have enough style", 0, tests.getATable(2,8));
    }

    @Test
    public void your_style_3_date_is_8(){
        Assert.assertEquals("Incorrect style amount", 2, tests.getATable(3,8));
    }

    @Test
    public void might_get_table() {
        Assert.assertEquals("Incorrect input of style", 1, tests.getATable(3,5));
    }
}
