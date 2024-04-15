import java.util.*;

public class LargestRectangleInHistogram {

    // remove the need of value stack
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> indexStack = new Stack<>();
        int max = 0;
        int height = 0;
        int width = 0;
        for (int i = 0; i <= heights.length; i++) {
            int current = (i == heights.length) ? -1 : heights[i];
            while (!indexStack.isEmpty() && heights[indexStack.peek()] > current) {
                height = heights[indexStack.pop()];
                int prevIndex = indexStack.isEmpty() ? -1 : indexStack.peek();
                width = i - prevIndex -1;
                max = Math.max(max, height * width);
            }
            indexStack.push(i);
        }

        return max;
    }


    public static void main(String[] args) {
        //int[] heights = { 2, 1, 5, 6, 2, 3 };
        //int[] heights = { 1 , 0, 8, 9, 5, 4};
        int[] heights = {3,0,5,7,4,8,1,00};
        LargestRectangleInHistogram l = new LargestRectangleInHistogram();
        int result = l.largestRectangleArea(heights);
        System.out.println(result);
    }
}


// Code lines greter
// public int largestRectangleArea(int[] heights) {
//     Stack<Integer> heightStack = new Stack<>();
//     Stack<Integer> indexStack = new Stack<>();
//     int max = 0;
//     int lastIndex = heights.length;
//     int poped = 0;
//     int popedIndex = 0;
//     int area = 0;
//     for (int i = 0; i < heights.length; i++) {
//         int current = heights[i];
//         int index = i;
//         while (!heightStack.isEmpty() && heightStack.peek() > current) {
//             poped = heightStack.pop();
//             popedIndex = indexStack.pop();
//             index = popedIndex;
//             area = poped * (i - popedIndex); // This is distacne
//             max = Math.max(max, area);
//         }

//         heightStack.push(current);
//         indexStack.push(index);
//     }

//     return max;
// }