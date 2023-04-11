package org.example.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class SortingAppTenArgumentsCaseTest {
    private final Sorting sorting = new Sorting();
    private final ArrayList<Integer> integerArrayList;


    public SortingAppTenArgumentsCaseTest(ArrayList<Integer> integerArrayList) {
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

        for (int i = 0; i < 10; i++) {
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

    @Test
    public void testTenArgumentsCase() {
        ArrayList<Integer> expected = new ArrayList<>(integerArrayList);

        sorting.sort(integerArrayList);

//        System.out.println("expected output before sorting:");
//        sorting.printArray(expected);
        System.out.println("expected output:");
        Collections.sort(expected);
        sorting.printArray(expected);
        System.out.println();

        Assert.assertEquals(expected, integerArrayList);
    }
}