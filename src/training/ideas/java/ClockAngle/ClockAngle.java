package training.ideas.java.ClockAngle;

/**
 * Created by idncpa on 12-08-2014.
 */
public class ClockAngle
{
    public static int ClockToAngle(int hourtime,int mintime)
    {
        int hourtime_in_mins = hourtime*60;
        int totalhourtime=hourtime_in_mins+mintime;
        int hourAngle = (int) (.5*(totalhourtime));
        int minAngle = 6 * mintime;
        int angle = Math.abs(hourAngle - minAngle);
        angle = 360 - angle;
        return angle;
    }
}
