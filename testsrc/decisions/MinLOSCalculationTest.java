package decisions;
import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.decisions.MinLOSCalculation;

public class MinLOSCalculationTest
{
    @Test
    public void given_FPLOS_is_YYYYYYY_then_MINLOS_should_be_1()
    {

        Assert.assertEquals(1, MinLOSCalculation.generateMINLOS("YNNNNNN"));
    }
    @Test
    public void given_FPLOS_is_NNNNNNN_then_MINLOS_should_be_0()
    {
        Assert.assertEquals(0, MinLOSCalculation.generateMINLOS("NNNNNNN"));
    }

}