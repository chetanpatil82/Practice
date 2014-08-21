package CharacterArrayTest;
import org.junit.Test;
import training.ideas.java.CharacterArray.IndexArray;

public class IndexArrayTest
{
    @Test
    public void given_character_array_and_character_return_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='g';
        int expectedIndex=2;
        junit.framework.Assert.assertEquals(expectedIndex, IndexArray.findIndex(inputCharacters, givenCharacter));
    }
}
