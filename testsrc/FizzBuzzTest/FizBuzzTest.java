package FizzBuzzTest;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.FizzBuzz.FizBuzz;

/**
 * Created by idncpa on 13-08-2014.
 */
public class FizBuzzTest
{
    @Test
    public  void print_fiz_buzz_for_given_numbers(){
        int num=20;
        String expectedNumber[]={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz"};
        Assert.assertArrayEquals(expectedNumber, FizBuzz.fizBuzz(num));
    }
}
