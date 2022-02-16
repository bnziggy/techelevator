package com.techelevator;

import java.math.BigDecimal;

//Step 1
public class Reservation {

    // Step 2
    //Instance variables
    private String name;
    private int numberOfNights;
    private BigDecimal estimatedTotal = BigDecimal.valueOf(0);

    private BigDecimal miniBarCleaningFee = BigDecimal.valueOf(12.99);
    private BigDecimal cleaningFee = BigDecimal.valueOf(34.99);
    private BigDecimal doubleCleaningFee = BigDecimal.valueOf(2);
    private BigDecimal pricePerNight = BigDecimal.valueOf(59.99);

    //Step 3
    //Constructor
    public Reservation(String name, int numberOfNights) {
        this.name = name;
        this.numberOfNights = numberOfNights;
        estimatedTotal = pricePerNight.multiply(BigDecimal.valueOf(numberOfNights));
    }

    //Step 5
    public BigDecimal calculateUsageTotal(boolean requiresCleaning, boolean usedMiniBar) {
        if (usedMiniBar == true) {
            estimatedTotal = estimatedTotal.add(miniBarCleaningFee);
        }

        if (requiresCleaning == true) {
            if (usedMiniBar == true) {
                cleaningFee = cleaningFee.multiply(doubleCleaningFee);
                estimatedTotal = estimatedTotal.add(cleaningFee);
            }
            else {
                estimatedTotal = estimatedTotal.add(cleaningFee);
            }
        }

        return estimatedTotal;
    }


    // Getters
    public String getName() {
        return name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public BigDecimal getEstimatedTotal() {
        return estimatedTotal;
    }


    //Step 6
    @Override
    public String toString() {
        return "RESERVATION - " + getName() + " - " + getEstimatedTotal();
    }


}
