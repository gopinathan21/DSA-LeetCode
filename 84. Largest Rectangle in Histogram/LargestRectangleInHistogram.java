import java.util.*;

public class LargestRectangleInHistogram
{
    public int largestRectangleArea(int[] heights) 
    {
        Arrays.sort(heights);
        int max = 0;
        for (int i =0 ; i < heights.length ; i++)
        {
            
            max = Math.max(max, heights[i] * (heights.length - i));
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] heights = {2,1,5,6,2,3};
        LargestRectangleInHistogram l = new LargestRectangleInHistogram();
        int result = l.largestRectangleArea(heights);
        System.out.println(result);
    }
}