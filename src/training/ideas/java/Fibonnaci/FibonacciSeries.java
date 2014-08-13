package training.ideas.java.Fibonnaci;

/**
 * Created by idncpa on 06-08-2014.
 */
public class FibonacciSeries
{
    public static int[] fibonacciCalc(int number)
    {
        int arr[] =new int[number];
        arr[0]=0;
        arr[1]=1;
        for(int counter=2; counter<number;counter++)
        {
            arr[counter]=arr[counter-1]+arr[counter-2];
        }
        return arr;
    }
    /*public static int fibonacciCalc(int number)
    {
        //int arr[] = new int[number];
        if (number == 1)
            return 1;
        else return (number + fibonacciCalc(number - 1));
    }*/
}

