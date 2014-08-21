package training.ideas.java.CharacterArray;

/**
 * Created by idncpa on 20-08-2014.
 */
public class SecondOccurence
{
    public static int occurrenceOfSecondArrayForGivenIndex(char[] firstArray, char[] secondArray, int givenIndex) {
        int resultIndex=0;

        int indexCounter,compareCounter,element;

        for(indexCounter=givenIndex;indexCounter<firstArray.length;indexCounter++)
        {
            element=indexCounter;
            for (compareCounter=0;compareCounter<secondArray.length;compareCounter++)
            {
                if(firstArray[element]==secondArray[compareCounter])
                {
                    element++;
                }
                else
                    break;
            }
            if(compareCounter==secondArray.length)
            {
                resultIndex=indexCounter;
                break;
            }

        }

        return resultIndex;
    }
}
