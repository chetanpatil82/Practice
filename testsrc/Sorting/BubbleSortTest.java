package Sorting;
import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.Sorting.BubbleSort;

public class BubbleSortTest
{
    @Test
    public void sortIntegerArrayInAsc() {
        double numbers[] = {2, 3, 1, 8, 5, 3, 9, 1};
        double expectedSortedNumbers[] = {1, 1, 2, 3, 3, 5, 8, 9};
        double sortedNumbers[] = BubbleSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length, sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers, 0.0);
    }
    @Test
    public void sortDoubleArrayInAsc() {
        double numbers[] = {2.0, 3.0, 1.0};
        double expectedSortedNumbers[] = {1.0, 2.0, 3.0};
        double sortedNumbers[] = BubbleSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length, sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers, 0.0);
    }
    @Test
    public void sortNegativeArrayInAsc()
    {
        double numbers[] = {-2, -3, -1};
        double expectedSortedNumbers[] = {-3, -2, -1};
        double sortedNumbers[] = BubbleSort.asc(numbers);
        Assert.assertEquals(expectedSortedNumbers.length, sortedNumbers.length);
        Assert.assertArrayEquals(expectedSortedNumbers, sortedNumbers, 0.0);
    }
}