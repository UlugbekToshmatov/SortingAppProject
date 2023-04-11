package org.example.util;

import org.example.exceptions.InvalidNumberOfArgumentsException;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public void sort(ArrayList<Integer> integers) {
        if (integers.size() < 1)
            throw new InvalidNumberOfArgumentsException("No number was entered to sort!");
        if (integers.size() > 10)
            throw new InvalidNumberOfArgumentsException("Number of arguments exceeded!");

        System.out.println("Actual input:");
        printArray(integers);
        Collections.sort(integers);
        System.out.println("Actual output:");
        printArray(integers);
    }

    public void printArray(ArrayList<Integer> array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
