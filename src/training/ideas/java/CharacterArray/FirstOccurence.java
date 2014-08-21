package training.ideas.java.CharacterArray;

/**
 * Created by idncpa on 20-08-2014.
 */
public class FirstOccurence
{
    public static int occurrenceOfSecondArray(char[] firstArray, char[] secondArray) {
        int resultIndex=0;

        int indexCounter,compareCounter,element;

        for(indexCounter=0;indexCounter<firstArray.length;indexCounter++)
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
