package com.vulcanis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberListTest {

    List<Integer> listOfPrimeNumbers = new ArrayList<Integer>();

    @Test
    public void shouldAddNumbersOnTheList() {
        if (PrimeNumber.divisibleOnlyByOneAndItself(2)) {
            listOfPrimeNumbers.add(2);
        }
        Assertions.assertFalse(listOfPrimeNumbers.isEmpty());
    }

    @Test
    public void shouldAddNumbersOfAnIntervalToTheList() {

        PrimeNumberList.addAllPrimesFrom(listOfPrimeNumbers, 50, 200);

        Assertions.assertFalse(listOfPrimeNumbers.isEmpty());
    }


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        PrimeNumberList.addAllPrimesFrom(list, 10, 20);

        for (int primeNumber:list) {
            System.out.println(primeNumber);
        }

    }
}