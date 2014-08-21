package training.ideas.java.CharacterArray;

public class lowerCase
{
    public static char[] lowerCaseConversion(char[] givenArray)
    {
        char resultArray[]=new char[givenArray.length];
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            resultArray[indexCounter]=Character.toLowerCase(givenArray[indexCounter]);
        }
        return resultArray;
    }

}
