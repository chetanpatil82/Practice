package training.ideas.java.Fibonnaci;
public class RecursionWithReturn
{
    public static int[] fibonacciCalculationRecursion(int num)
    {
        int[] fibonacciSeriesArray = new int[num];
        return fibonacciSeries(num,fibonacciSeriesArray);
    }
    public static int[] fibonacciSeries(int index,int[] fibonacciSeriesArray)
    {
        if (index == 0)
        {
            return fibonacciSeriesArray;
        }
        if (index == 1)
        {
            fibonacciSeriesArray[0]=0;
            return fibonacciSeriesArray;
        }
        if (index == 2)
        {
            fibonacciSeriesArray[1] = 1;
            return fibonacciSeriesArray;
        }
        fibonacciSeries(index - 1,fibonacciSeriesArray);
        fibonacciSeriesArray[index-1]=fibonacciSeriesArray[index - 2]+ fibonacciSeriesArray[index-3];
        return fibonacciSeriesArray;
    }
 }
