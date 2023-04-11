package org.example.util;

import org.example.exceptions.InvalidNumberOfArgumentsException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SortingAppNoArgumentCaseTest {
    private final Sorting sorting = new Sorting();
    private final ArrayList<Integer> integerArrayList;


    public SortingAppNoArgumentCaseTest(ArrayList<Integer> integerArrayList) {
        this.integerArrayList = integerArrayList;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        List<Object[]> args = new ArrayList<>();

        args.add(new Object[]{new ArrayList<Integer>()});
        args.add(new Object[]{new ArrayList<Integer>()});
        args.add(new Object[]{new ArrayList<Integer>()});
        args.add(new Object[]{new ArrayList<Integer>()});

        return args;
    }

    @Test(expected = InvalidNumberOfArgumentsException.class)
    public void testNoArgumentCase() {
        sorting.sort(integerArrayList);
    }
}