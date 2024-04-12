public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = 1;
        int waterUnits = 0;
        while(left < height.length - 1)
        {
            if(height[left] == 0) {left++; right++;}
            if(height[left] <= height[right] )
            {
                int value = height[left];
                left++;
                while(left < right)
                {
                    
                    waterUnits += value - height[left];
                    left++;
                }
            }
            if(right == height.length -1 && left < height.length -1)
            {
                left++;
                right = left +1;
                
            }
            else{
                right++;
            }
            
        }
        return waterUnits;
    }
    public static void main(String[] args)
    {
        int[] h = {4,2,3};
        //int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
        //int[] h ={4,2,0,3,2,5};
        TrappingRainWater t = new TrappingRainWater();
        int result = t.trap(h);
        System.out.println(result);
    }
}
