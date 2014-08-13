package training.ideas.java.decisions;

/**
 * Created by idncpa on 25-07-2014.
 */
public class MinLOSCalculation
{

/*    public static int generateMINLOS(String FPLOSPattern)
    {
        return FPLOSPattern.indexOf("Y")+1;


    }*/

    public static int generateMINLOS(String FPLOSPattern)
    {
        return FPLOSPattern.toUpperCase().indexOf("Y")+1;


    }

}

