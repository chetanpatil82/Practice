package CharacterArrayTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.CharacterArray.EnnIndexArray;

/**
 * Created by idncpa on 20-08-2014.
 */
public class EndIndexArrayTest
{

    @Test
    public void given_character_array_and_an_end_index_return_subArray()
    {
        char givenArray[]={'a','b','c','d','e','f'};
        int endIndex=4;
        char expectedArray[]={'a','b','c','d','e'};
        Assert.assertArrayEquals(expectedArray, EnnIndexArray.subArrayEndIndex(givenArray, endIndex));
    }
}
