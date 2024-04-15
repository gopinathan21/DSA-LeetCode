public class CanPlaceFlowers {
        public boolean canPlaceFlowersS(int[] flowerbed, int n) {
            int count = 0;
            for(int i = 0 ; i < flowerbed.length; i++)
            {
                boolean prevIndex = ((i == flowerbed.length -1 ) || flowerbed[i] == 0);
                boolean nextIndex = ((i == 0 ) || flowerbed[i] == 0);
                if(prevIndex && nextIndex )
                {
                    flowerbed[i] = 1;
                    count++;
                }
            }
            return count >= n;
        }
    public static void main(String[] args)
    {
        int[] arr ={1,0,0,0,1,0,0};
        CanPlaceFlowers c = new CanPlaceFlowers();
        boolean r = c.canPlaceFlowersS(arr, 2);
        System.out.println(r);
    }
}


// More lines of code
// int m = 0;
// if(flowerbed.length ==1)
// {
//     if(flowerbed[0] == 0)
//     {
//         m++;
//         return m>=n;
//     }
//     else{
//         return m>=n;
//     }
// }

//     for(int i = 0 ; i < flowerbed.length; i++)
//     {
//         if(i == 0 )
//         {
//             if(flowerbed[i] == 0 && flowerbed[i+1] == 0)
//             {
//                 m++;
//                 flowerbed[i] = 1;
//             }
//         }
//         else if(i == flowerbed.length -1 )
//         {
//             if(flowerbed[i] == 0 && flowerbed[i-1] == 0)
//             {
//                 m++;
//                 flowerbed[i] = 1;
//             } 
//         }
//         else
//         {
//             if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] ==0)
//             {
//                 m++;
//                 flowerbed[i] = 1;
//             }
//         }
//         if(m >=n) return m>=n;
//     }
//     return m>=n;