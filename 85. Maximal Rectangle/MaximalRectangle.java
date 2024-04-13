import java.util.*;
 class MaximalRectangle {

    public int maximalRectangles(char[][] matrix) {
        Stack<Integer> s = new Stack<>();
        int maxi = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char[] row = matrix[i];
                if(row[j] == '1')
                {
                    s.push(j);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        
        MaximalRectangle m = new MaximalRectangle();
        int result = m.maximalRectangles(matrix);
        System.out.println(result);
    }

}
