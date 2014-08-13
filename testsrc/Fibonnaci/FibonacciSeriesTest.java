package Fibonnaci;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.Fibonnaci.FibonacciSeries;

public class FibonacciSeriesTest
{
    @Test
    public void fibonacci_series_for_5_number()
    {
        int number =10;
        int expectedNumber[]={0,1,1,2,3,5,8,13,21,34};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciCalc(number));

    }
}
