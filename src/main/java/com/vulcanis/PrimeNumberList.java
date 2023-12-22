package com.vulcanis;

import java.util.List;

public class PrimeNumberList {

    public static void addAllPrimesFrom(List<Integer> list, int initialNumber, int finalNumber) {
        for (int i = initialNumber; i <= finalNumber; i++) {
            if (PrimeNumber.divisibleOnlyByOneAndItself(i))
                list.add(i);
        }
    }

}
