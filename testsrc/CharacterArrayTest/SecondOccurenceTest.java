package CharacterArrayTest;

import org.junit.Test;
import training.ideas.java.CharacterArray.SecondOccurence;

/**
 * Created by idncpa on 20-08-2014.
 */
public class SecondOccurenceTest
{
    @Test
    public void given_two_character_arrays_return_occurrence_of_second_array_for_given_index()
    {
        char firstArray[]={'t','h','i','s','i','s','t','h','i','s'};
        char secondArray[]={'t','h','i','s'};
        int givenIndex=2;
        int expectedIndex=6;
        junit.framework.Assert.assertEquals(expectedIndex, SecondOccurence.occurrenceOfSecondArrayForGivenIndex(firstArray, secondArray, givenIndex));
    }
}
