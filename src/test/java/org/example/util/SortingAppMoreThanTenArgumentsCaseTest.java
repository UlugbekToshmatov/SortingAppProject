package org.example.util;

import org.example.exceptions.InvalidNumberOfArgumentsException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SortingAppMoreThanTenArgumentsCaseTest {
    private final Sorting sorting = new Sorting();
    private final ArrayList<Integer> integerArrayList;


    public SortingAppMoreThanTenArgumentsCaseTest(ArrayList<Integer> integerArrayList) {
        this.integerArrayList = integerArrayList;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        List<Object[]> args = new ArrayList<>();
        ArrayList<Integer> inputParams1 = new ArrayList<>();
        ArrayList<Integer> inputParams2 = new ArrayList<>();
        ArrayList<Integer> inputParams3 = new ArrayList<>();
        ArrayList<Integer> inputParams4 = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 11; i++) {
            inputParams1.add(random.nextInt(100));
            inputParams2.add(random.nextInt(100));
            inputParams3.add(random.nextInt(100));
            inputParams4.add(random.nextInt(100));
        }

        args.add(new Object[]{inputParams1});
        args.add(new Object[]{inputParams2});
        args.add(new Object[]{inputParams3});
        args.add(new Object[]{inputParams4});

        return args;
    }

    @Test(expected = InvalidNumberOfArgumentsException.class)
    public void testMoreThanTenArgumentsCase() {
        System.out.println("Actual input:");
        sorting.printArray(integerArrayList);
        System.out.println();
        sorting.sort(integerArrayList);
    }
}