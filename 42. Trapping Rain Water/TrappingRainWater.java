import java.util.Stack;

class TrappingRainWater {
    public  int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int l_wall = height[i];
        int r_wall = height[j];
        int waterUnits = 0;
        while (i < j) {
            if (l_wall <= r_wall) // If right is greater means we found the correct wall in the right side
            {
                waterUnits += Math.min(l_wall, r_wall) - height[i];
                i++;
                l_wall = Math.max(l_wall, height[i]);
                
            } else { // we have found the correct wall in the left side
                waterUnits += Math.min(l_wall, r_wall) - height[j];
                j--;
                r_wall = Math.max(r_wall, height[j]);
                
            }
        }
        return waterUnits;
    }
    public static void main(String[] args)
    {
        //int[] h = {4,2,3};
        int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
        //int[] h ={4,2,0,3,2,5};
        TrappingRainWater t = new TrappingRainWater();
        int result = t.trap(h);
        System.out.println(result);
    }
}
// int waterUnits = 0;
//         Stack<Integer> s = new Stack<>();
//         for(int i = 0 ; i < height.length ; i++)
//         {
//             int current = height[i];
//             while(!s.isEmpty() && current > s.peek())
//             {
//                 int middle = s.pop();
//                 if(s.empty())break;
//                 int top = s.peek();
//                 int distanceBWcToTop = i - s.size() ;   // we need index here so we can push the index to the stack
//                 int bHeight = Math.min(current , top ) - middle;
//                 waterUnits += distanceBWcToTop * bHeight;
//             }
//             s.push(current);
//         }
//         return waterUnits;

//Another approach
// This approach idea is whenever initiate the first non-zero as a wall so whenever we found a number greater than the first one we can fill everything by subtracting the values with the first number 
// Why it is not working 
// since we are only looking for number that is greater than the first but if a small number is found and we found another greater num we can also fill water in that case
// int left = 0;
//         int right = 1;
//         int waterUnits = 0;
//         while(left < height.length - 1)
//         {
//             if(height[left] == 0) {left++; right++;} // not able to fill when 0
//             if(height[left] <= height[right] )
//             {
//                 int value = height[left];
//                 left++;
//                 while(left < right)
//                 {
                    
//                     waterUnits += value - height[left];
//                     left++;
//                 }
//             }
//             if(right == height.length -1 && left < height.length -1)
//             {
//                 left++;
//                 right = left +1;
                
//             }
//             else{
//                 right++;
//             }
            
//         }
//         return waterUnits;




// This is another approach 
//Finding walls on the way and filling water

// int waterUnits = 0;
//         Stack<Integer> s = new Stack<>();
//         for(int i = 0 ; i < height.length ; i++)
//         {
//             int current = height[i];
//             while(!s.isEmpty() && current > height[s.peek()])
//             {
//                 int middle = s.pop();
//                 if(s.empty())break;
//                 int top = s.peek();
//                 int distanceBWcToTop = i - top - 1 ;   // we need index here so we can push the index to the stack
//                 int bHeight = Math.min(current , height[top] ) - height[middle];
//                 waterUnits += distanceBWcToTop * bHeight;
//             }
//             s.push(i);
//         }
//         return waterUnits;