package training.ideas.java.CharacterArray;

/**
 * Created by idncpa on 20-08-2014.
 */
public class OccurenceOfGiven
{
    public static int occurrenceOfGivenCharacter(char[] givenArray, char givenCharacter)
    {
        int count=0;
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            if(givenArray[indexCounter]==givenCharacter)
            {
                count++;
            }
        }
        return count;
    }
}
