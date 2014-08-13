package training.ideas.java.FizzBuzz;

public class FizzBuzz
{
    public static String fizzBuzzPrint(int number)
    {
        String Expect = "";

        if(number %3==0)
        {
            Expect += "Fizz";
            //Expect = Expect + "Fizz";
        }
        else
        if(number %5==0)
        {
            Expect += "Buzz";
        }
        return Expect;
    }
}
