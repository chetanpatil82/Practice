package training.ideas.java.CharacterArray;

/**
 * Created by idncpa on 20-08-2014.
 */
public class upperCase
{
    public static char[] upperCaseConversion(char[] givenArray)
    {
        char resultArray[]=new char[givenArray.length];
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            resultArray[indexCounter]=Character.toUpperCase(givenArray[indexCounter]);
        }
        return resultArray;
    }
}
