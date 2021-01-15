import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class MaximumGap
{
    @Test
    public void Check_Positive_Values()
    {
        assertEquals(  4, Solution.maxGap(new int[]{13,10,2,9,5}));
        assertEquals(  8, Solution.maxGap(new int[]{13,3,5}));
        assertEquals(168, Solution.maxGap(new int[]{24,299,131,14,26,25}));
    }
    @Test
    public void Check_Negative_Values()
    {
        assertEquals( 23, Solution.maxGap(new int[]{-3,-27,-4,-2}));
        assertEquals(767, Solution.maxGap(new int[]{-7,-42,-809,-14,-12}));
    }
    @Test
    public void Check_Mixed_Values()
    {
        assertEquals(278, Solution.maxGap(new int[]{12,-5,-7,0,290}));
        assertEquals(576, Solution.maxGap(new int[]{-54,37,0,64,-15,640,0}));
    }
    @Test
    public void Test_Random_Numbers()
    {
        for (int i = 0; i < 100; i++)
        {
            int[] a = new int[(int)(Math.random() * 199) + 3], // array size range: [3, 202)
                    b = new int[a.length];
            for (int j = 0; j < a.length; j++)
                a[j] = b[j] = (int)(Math.random() * 201) - 100; // Element value range: [-100, 100)
            assertEquals(solution(a), Solution.maxGap(b));
        }
    }
    private static int solution(int[] numbers)
    {
        Arrays.sort(numbers);
        int max = 0;
        for (int i = 0; i < numbers.length-1; i++)
        {
            int gap = Math.abs(numbers[i] - numbers[i+1]);
            if ( gap > max )
                max = gap;
        }
        return max;
    }
}