```java
class Solution {
    private boolean closed;

    public int closedIsland(int[][] grid) {
        boolean closed;
        int count = 0;
        if (grid.length < 3 || grid[0].length < 3) {
            return 0;
        }
        for (int i = 1 ; i < grid.length - 1 ; i++) {
            for (int j = 1 ; j < grid[0].length - 1 ; j++) {
                if (grid[i][j] == 0) {
                    // 从没有访问过的0出发
                    closed = true;
                    dfs(grid, i, j);
                    if (closed) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid, int i, int j) {
         //检查是否在边界
        if (i == 0 || j == 0 || i == grid.length -1 || j == grid[i].length - 1) {
            if (grid[i][j] == 0) {
                closed = false;
            }
            return;
        }
        if (grid[i][j] != 0) {
            return;
        }
        grid[i][j] = 1;
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
    }
}
```