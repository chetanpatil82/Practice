package CharacterArrayTest;

import org.junit.Test;
import training.ideas.java.CharacterArray.ArrayOccurences;

public class OccurencesArrayTest
{
    @Test
    public void given_character_array_with_an_index_and_character_return_next_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='g';
        int givenIndex=2;
        int expectedIndex=6;
        junit.framework.Assert.assertEquals(expectedIndex, ArrayOccurences.findNextIndex(inputCharacters, givenCharacter, givenIndex));
    }
}
