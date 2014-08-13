package training.ideas.java.Rounding;

/**
 * Created by idncpa on 12-08-2014.
 */
public class Rounding
{
    public static double RoundCalc(double inputnumber)
    {

        inputnumber=(Math.ceil(inputnumber*20))/20;
        return inputnumber;
    }

}
