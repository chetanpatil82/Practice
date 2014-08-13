package RoundingTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.Rounding.Rounding;

/**
 * Created by idncpa on 12-08-2014.
 */
public class RoundingTest
{
    @Test
    public void round_ceil_if_number_11_21()
    {
        double inputnumber=11.21;
        double expectednumber = 11.25;
        Assert.assertEquals(expectednumber, Rounding.RoundCalc(inputnumber), 0.0);
    }
    @Test
    public void round_ceil_if_number_11_25()
    {
        double inputnumber=11.25;
        double expectednumber = 11.25;
        Assert.assertEquals(expectednumber,Rounding.RoundCalc(inputnumber),0.0);
    }
}
