package ClockAngleTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.ClockAngle.ClockAngle;

public class ClockAngleTest
{
    @Test
    public void convert_clock_time_to_angle_when_time_is_12_00()
    {

        int hourtime=12;
        int mintime=0;
        double expectedangle =0;
        Assert.assertEquals(expectedangle, ClockAngle.ClockToAngle(hourtime, mintime), 0);
    }
   /* @Test
    public void convert_clock_time_to_angle_when_time_is_12_00()
    {
        int hourtime=12;
        int mintime=0;
        double expectedangle =0;
        Assert.assertEquals(expectedangle, ClockAngle.ClockToAngle(hourtime, mintime), 0);
    }

*/
}
