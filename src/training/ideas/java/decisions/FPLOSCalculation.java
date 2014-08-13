package training.ideas.java.decisions;
//import java.lang.Double;

public class FPLOSCalculation
{
    public static String generateFPLOSPattern(final double rateValue, double[] lrvForSevenDays)
    {
        String fplosPattern = "";
        double sumOfRateValue = 0.0;
        double sumOfLRV = 0.0;
/*        for (int i=0;i<lrvForSevenDays.length;i++)
        {  }*/
       for (double lrvForIndividualLOS : lrvForSevenDays)
        {
            sumOfRateValue += rateValue;
            sumOfLRV += lrvForIndividualLOS;
            if (sumOfRateValue >= sumOfLRV)
                fplosPattern += "Y";
            else
            {
                fplosPattern += "N";
            }
        }
        return fplosPattern;
    }

    public static String[] generateFPLOSPattern(double[] rateSpectrum,double[] lrvForSevenDays)
    {
        String[] spectrumfplospattern;
        spectrumfplospattern = new String[rateSpectrum.length];
        int counter = 0;
        for (double rateValue: rateSpectrum)
        {
            spectrumfplospattern [counter++] = generateFPLOSPattern(rateValue,lrvForSevenDays);
        }
        return spectrumfplospattern;
    }
}

