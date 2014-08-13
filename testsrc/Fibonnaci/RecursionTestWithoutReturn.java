package Fibonnaci;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.Fibonnaci.RecursionWithReturn;

/**
 * Created by idncpa on 12-08-2014.
 */
public class RecursionTestWithoutReturn
{
    @Test
    public  void given_recursion_series_of_5_numbers()
    {
        int num=5;
        int expectedNumber[]={0,1,1,2,3};
        Assert.assertArrayEquals(expectedNumber, RecursionWithReturn.fibonacciCalculationRecursion(num));
    }
}
