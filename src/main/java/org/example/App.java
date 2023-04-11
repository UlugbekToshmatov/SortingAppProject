package org.example;

import org.example.util.Sorting;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String arg : args) {
            numbers.add(Integer.parseInt(arg));
        }

        sorting.sort(numbers);

    }
}