package CharacterArrayTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.CharacterArray.ConcatenateArray;

/**
 * Created by idncpa on 19-08-2014.
 */
public class ConcatenateArrayTest
{
    @Test
    public void given_two_character_array_return_concatenate_array()
    {
        char first[]={'a','b','c','d'};
        char second[]={'i','j','k','l'};
        char expectedOutput[]={'a','b','c','d','i','j','k','l'} ;
        Assert.assertArrayEquals(expectedOutput, ConcatenateArray.concatenation(first, second));

    }
}




