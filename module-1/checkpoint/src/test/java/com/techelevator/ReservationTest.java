package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ReservationTest {

    @Test
    public void test_minibar_used_no_cleaning() {
        Reservation test = new Reservation("Brett", 1);
        test.calculateUsageTotal(false, true);

        BigDecimal testTotal = BigDecimal.valueOf(59.99); //price for one night
        testTotal = testTotal.add(BigDecimal.valueOf(12.99));

        Assert.assertEquals("RESERVATION - Brett - " + testTotal, test);
    }
}
