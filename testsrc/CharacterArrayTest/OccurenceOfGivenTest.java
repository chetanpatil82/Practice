package CharacterArrayTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.CharacterArray.OccurenceOfGiven;

/**
 * Created by idncpa on 20-08-2014.
 */
public class OccurenceOfGivenTest
{

    @Test
    public void given_character_array_and_character_return_occurrence_of_the_character()
    {
        char givenArray[]={'a','b','c','d','c','e','f','c'};
        char givenCharacter='c';
        int occurrence=3;
        Assert.assertEquals(occurrence, OccurenceOfGiven.occurrenceOfGivenCharacter(givenArray, givenCharacter));
    }
}


