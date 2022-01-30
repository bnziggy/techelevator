package com.techelevator.math;

import com.techelevator.Fibonnoci;

import java.util.List;

public class FibApp {
    public static void main(String[] args) {
        List<Integer> fibUpTo20 = Fibonnoci.getFibonacciNumbers(21);
        System.out.println(fibUpTo20);
    }
}
