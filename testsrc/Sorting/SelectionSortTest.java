package Sorting;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.Sorting.SelectionSort;

public class SelectionSortTest
{
    public void sortIntegerArrayInAsc_usingSelectionSort(){
        double numbers[]= {2,3,1,8,5,3,9,1};
        double expectedSortedNumbers[]={1,1,2,3,3,5,8,9};
        double sortedNumbers[]= SelectionSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length, sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers, 0.0);
    }
    @Test
    public void sortNegativeIntegerArrayInAsc_usingSelectionSort(){
        double numbers[]= {-2,-3,-1};
        double expectedSortedNumbers[]={-3,-2,-1};
        double sortedNumbers[]=SelectionSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length,sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers,0.0);
    }

}
