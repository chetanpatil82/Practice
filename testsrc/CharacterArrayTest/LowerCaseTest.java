package CharacterArrayTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.CharacterArray.lowerCase;

/**
 * Created by idncpa on 20-08-2014.
 */
public class LowerCaseTest
{
    @Test
    public void given_character_array_return_lowercase_array()
    {
        char givenArray[]={'A','F','E','V','B'};
        char expectedArray[]={'a','f','e','v','b'};
        Assert.assertArrayEquals(expectedArray, lowerCase.lowerCaseConversion(givenArray));
    }

}
