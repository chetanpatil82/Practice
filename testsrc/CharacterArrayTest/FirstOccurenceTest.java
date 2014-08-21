package CharacterArrayTest;

import org.junit.Test;
import training.ideas.java.CharacterArray.FirstOccurence;

/**
 * Created by idncpa on 20-08-2014.
 */
public class FirstOccurenceTest
{
    @Test
    public void given_two_character_arrays_return_index_of_first_occurrence_of_second_array()
    {
        char firstArray[]={'t','h','i','s','i','s','t','e','s','t'};
        char secondArray[]={'t','e','s','t'};
        int expectedIndex=6;
        junit.framework.Assert.assertEquals(expectedIndex, FirstOccurence.occurrenceOfSecondArray(firstArray, secondArray));
    }
    @Test
    public void given_two_character_arrays_return_first_index_of_occurrence_of_second_array()
    {
        char firstArray[]={'i','n','d','i','a','d','i'};
        char secondArray[]={'d','i'};
        int expectedIndex=2;
        junit.framework.Assert.assertEquals(expectedIndex,FirstOccurence.occurrenceOfSecondArray(firstArray,secondArray));
    }

}
