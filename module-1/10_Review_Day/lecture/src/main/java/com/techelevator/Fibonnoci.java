package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Fibonnoci {

    public static List<Integer> getFibonacciNumbers(int upTo) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(1);

        while (numbers.get(numbers.size() - 1) <= upTo) {
            int nextValue = numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2);
            if (nextValue <= upTo) {
                numbers.add(nextValue);
            }
            else {
                break;
            }
        }

        return numbers;
    }
}
