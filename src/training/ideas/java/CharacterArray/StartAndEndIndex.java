package training.ideas.java.CharacterArray;

/**
 * Created by idncpa on 20-08-2014.
 */
public class StartAndEndIndex
{

    public static char[] subArrayStartIndexEndIndex(char[] givenArray, int startIndex, int endIndex) {
        int length=(endIndex-startIndex)+1;
        char resultArray[]=new char[length];
        for(int indexCounter=0;indexCounter<length;indexCounter++)
        {
            resultArray[indexCounter]=givenArray[indexCounter+startIndex];
        }
        return resultArray;
    }

}


