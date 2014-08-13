package FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.FizzBuzz.FizzBuzz;

public class FizzBuzzTest
{

    @Test
    public void fizzBuzz_number_is_3()
    {
        int given=3;
        String expected="Fizz";
        Assert.assertEquals(expected, FizzBuzz.fizzBuzzPrint(given));

    }
    @Test
    public void fizzBuzz_number_is_5()
    {
        int given=5;
        String expected="Buzz";
        Assert.assertEquals(expected, FizzBuzz.fizzBuzzPrint(given));

    }
    /*public void fizzBuzz_number_is_multipleof 3_and 5()
    {
        int given=5;
        String expected="Buzz";
        Assert.assertEquals(expected, FizzBuzz.fizzBuzzPrint(given));

    }*/

}
