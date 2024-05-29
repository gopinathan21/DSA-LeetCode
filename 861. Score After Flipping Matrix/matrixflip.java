public class matrixflip {
    static public int matrixScore(int[][] grid) {
        int col = grid.length;
        int row = grid[0].length;
        // Check the first element of the first row is always one because it is the
        // larger
        for (int i = 0; i < col; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < row; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }

        // Check each col because it only can be converted - dont change the row

        for (int i = 0; i < row; i++) {
            int colOneCount = 0;
            for (int j = 0; j < col; j++) {
                colOneCount = grid[j][i] == 1 ? colOneCount++ : colOneCount;
            }
            if (col - colOneCount > colOneCount) {
                for (int j = 0; j < col; j++) {
                    grid[j][i] ^= 1;
                }
            }
        }
        int rowValue = 0;
        for(int i = 0; i < col; i++)
        {
            int localCount = 0;
            for(int j = 0 ; j < row; j++)
            {
                if(grid[i][j] == 1)
                {
                    localCount = grid[i][j] * (1 << (row - j));
                }
            }
            rowValue += localCount;
        }
        return rowValue;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 0}
        };
        int r = matrixScore(grid);
        System.out.println(r);
    }
} 
