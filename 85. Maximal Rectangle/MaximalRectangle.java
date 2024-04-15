import java.util.*;
 class MaximalRectangle {
 /// the idea we change the matrix to normal array and calculating the are like histogram
    public int maximalRectangles(char[][] matrix) {

        List<Boolean> bool = new ArrayList<>();
        if(matrix ==null ||  matrix.length == 0 || matrix[0].length == 0)
        {
            return 0;
        }
        int col = matrix.length;
        int row = matrix[0].length;
        int[] arr = new int[row];
        int max = 0;
        Stack<Integer> s = new Stack<>();
        for(int k = 0 ; k < col; k++)
        {
            for(int j = 0 ; j < matrix[k].length; j++)
            {
                arr[j] = matrix[k][j] == '1' ? arr[j]+1:0;
            }
            for(int i = 0 ; i <= row; i++)
            {
            int current = (i == row) ? -1 : arr[i];
            while(!s.isEmpty() && current < arr[s.peek()] )
            {
                int popedEle = arr[s.pop()];
                int prevIndex = s.isEmpty() ? -1 : s.peek();
                int width = i - 1 - prevIndex;
                max = Math.max(max , popedEle * width);
            }
            if( i != row) s.push(i);
            
        }
        }
        
        return max;
    }

    public static void main(String[] args)
    {
        char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        // char[][] matrix = {
        //     {'1','1','1','1','2'},
        //     {'1','1','1','1','2'},
        //     {'1','1','1','1','2'},
        //     {'1','1','1','1','2'}
        // };
        
        MaximalRectangle m = new MaximalRectangle();
        int result = m.maximalRectangles(matrix);
        System.out.println(result);
    }

}
