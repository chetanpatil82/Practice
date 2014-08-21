package CharacterArrayTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.CharacterArray.StartAndEndIndex;

/**
 * Created by idncpa on 20-08-2014.
 */
public class StartAndEndIndexTest
{
    @Test
    public void given_character_array_start_index_and_an_end_index_return_subArray()
    {
        char givenArray[]={'a','b','c','d','e','f'};
        int startIndex=1;
        int endIndex=4;
        char expectedArray[]={'b','c','d','e'};
        Assert.assertArrayEquals(expectedArray, StartAndEndIndex.subArrayStartIndexEndIndex(givenArray, startIndex, endIndex));
    }
}
