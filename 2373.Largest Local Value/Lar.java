import java.util.*;
public class Lar {
        public int[][] largestLocal(int[][] grid) 
        {
            ArrayList<ArrayList<Integer>> maxlocal = new ArrayList<>();
            int m = grid.length;
            int n = grid[0].length;
            for(int i = 0 ; i <= m - 3 ; i++ )
            {
                ArrayList<Integer> arr = new ArrayList<>();
                for(int j = 0 ; j <= n -3; j++)
                {
                    int max = maxHelper(grid , i , j);
                    arr.add(max);
                }
                maxlocal.add(arr);
            }
            int row = maxlocal.size();
            int col = maxlocal.get(0).size();
            int[][] result = new int[row][col];
            for(int i= 0; i < col ; i++)
            {
                for(int j = 0; j < row ; j++)
                {
                    result[i][j] = maxlocal.get(i).get(j);
                }
            }
            return result;
        }
        public int maxHelper(int[][]grid , int col , int row)
        {
            ArrayList<Integer> a = new ArrayList<>();
            int maxLocal = Integer.MIN_VALUE;
            for(int i = col; i < col+3 ; i++)
            {
                for(int j = row ; j < row + 3; j++ )
                {
                    maxLocal = Math.max(maxLocal , grid[i][j]);
                }
            }
            return maxLocal;
        }

        public static void main(String[] args) {
            int[][] a = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
            Lar s = new Lar();
            s.largestLocal(a);
        }
        }
    
    
