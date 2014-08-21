package training.ideas.java.CharacterArray;

public class ArrayOccurences
{
    public static int findNextIndex(char[] inputCharacters, char givenCharacter, int givenIndex)
    {
        int resultIndex=0;
        for(int indexCounter=givenIndex+1;indexCounter<inputCharacters.length;indexCounter++)
        {
            if(inputCharacters[indexCounter]==givenCharacter)
            {
                resultIndex=indexCounter;
                break;
            }
            else
            {
                resultIndex=-1;
            }
        }
        return resultIndex;
    }
}
