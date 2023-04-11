package org.example.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        SortingAppNoArgumentCaseTest.class,
        SortingAppOneArgumentCaseTest.class,
        SortingAppTenArgumentsCaseTest.class,
        SortingAppMoreThanTenArgumentsCaseTest.class
})
public class SortingAppSuiteTest {

    public SortingAppSuiteTest() {
    }

}