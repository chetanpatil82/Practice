package training.ideas.java.CharacterArray;

/**
 * Created by idncpa on 20-08-2014.
 */
public class EnnIndexArray
{
    public static char[] subArrayEndIndex(char[] givenArray, int endIndex) {
        char resultArray[]=new char[endIndex+1];
        for(int indexCounter=0;indexCounter<=endIndex;indexCounter++)
        {
            resultArray[indexCounter]=givenArray[indexCounter];
        }
        return resultArray;
    }
}
