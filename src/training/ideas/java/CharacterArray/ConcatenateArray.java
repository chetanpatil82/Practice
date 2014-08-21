package training.ideas.java.CharacterArray;

/**
 * Created by idncpa on 19-08-2014.
 */
public class ConcatenateArray
    {
        public static char[] concatenation(char[] first, char[] second)
        {
            int lengthOfFirst=first.length;
            int lengthOfSecond=second.length;
            char resultCharacter[]=new char[lengthOfFirst+lengthOfSecond];
            System.arraycopy(first,0,resultCharacter,0,lengthOfFirst);
            System.arraycopy(second,0,resultCharacter,lengthOfFirst,lengthOfSecond);
            return resultCharacter;
        }


    }
