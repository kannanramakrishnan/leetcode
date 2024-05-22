class RottingOranges {
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int output = 0;
        int freshFruits = 0;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j]==1)
                    freshFruits++;

                if (grid[i][j]==2)
                    q.add(new int[] {i, j});
            }
        }

        if (freshFruits==0) return 0;
        if (q.isEmpty()) return -1;

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!q.isEmpty() && freshFruits>0) {
            int size = q.size();
            while (size-- > 0) {
                int[] index = q.remove();

                for (int j=0; j<4; j++) {
                    int row = directions[j][0]+index[0];
                    int col = directions[j][1]+index[1];

                    if (
                            row<0 || row==rows
                            || col<0 || col==cols
                            || grid[row][col]!=1
                    ) continue;

                    grid[row][col] = 2;
                    q.add(new int[] {row, col});
                    freshFruits--;
                }
            }
            output++;
        }

        return (freshFruits>0) ? -1 : output;
    }
}
