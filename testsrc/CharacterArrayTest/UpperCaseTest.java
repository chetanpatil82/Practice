package CharacterArrayTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.CharacterArray.upperCase;

public class UpperCaseTest
{
    private upperCase CharacterArray;

    @Test
    public void given_character_array_with_mixed_characters_return_uppercase_array()
    {
        char givenArray[]={'a','F','E','v','b'};
        char expectedArray[]={'A','F','E','V','B'};
        Assert.assertArrayEquals(expectedArray, CharacterArray.upperCaseConversion(givenArray));
    }

}
