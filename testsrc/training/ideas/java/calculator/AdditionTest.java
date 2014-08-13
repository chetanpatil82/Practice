package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class AdditionTest
{
    @Test
    public void addTwoIntegers()
    {
        Assert.assertEquals(5, Addition.perform(2, 3));
    }
    @Test
    public void addTwoDoubles()
    {
        Assert.assertEquals(3.10 + 3.11, Addition.perform(3.10, 3.11));
    }
    @Test
    public void addIntegerArray()
    {
        int[] array = {5, 5, 3};
        Assert.assertEquals(13, Addition.perform(array));
    }
    @Test
    public void addDoubleArray()
    {
        double[] array = {1.21, 2.22};
        double[] secondArray = new double[10];
        Assert.assertEquals(3.43, Addition.perform(array));
    }
    @Test
    public void sumArrayDouble()
    {
        double darray[]={1.21,2.45,3.11,2.12};
        Assert.assertEquals(8.89,Addition.perform1(darray));
    }

}