```java
class Solution {
    public int largestIsland(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 1;
        }
        int res = 0, index = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j < grid[0].length ; j++) {
                if(grid[i][j] == 1) {
                    map.put(index, calcArea(index, grid, i, j));
                    index++;
                }
            }
        }
        if(map.size() == 0) {
            return 1;
        }
        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j < grid[0].length ; j++) {
                if(grid[i][j] == 0) {
                    Set<Integer> islands = getIslands(grid, i, j);
                    if(islands.size() == 0) {
                        continue;
                    }
                    res = Math.max(res, islands.stream().map(item -> map.get(item)).reduce(Integer::sum).orElse(0) + 1);
                }
            }
        }
        if(res == 0) {
            return map.get(2); //全是岛屿，没有海洋
        }
        return res;
    }

    public int calcArea(int index, int[][] grid, int i, int j) {
        if(!inArea(grid, i, j) || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = index;
        return 1
            + calcArea(index, grid, i+1, j)
            + calcArea(index, grid, i, j+1)
            + calcArea(index, grid, i-1, j)
            + calcArea(index, grid, i, j-1);
    }

    private boolean inArea(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ) {
            return false;
        }
        return true;
    }

    private Set<Integer> getIslands(int[][] grid, int i, int j) {
        Set<Integer> res = new HashSet<>();
        if(inArea(grid, i+1, j) && grid[i+1][j] != 0) {
            res.add(grid[i+1][j]);
        }
        if(inArea(grid, i, j+1) && grid[i][j+1] != 0) {
            res.add(grid[i][j+1]);
        }
        if(inArea(grid, i-1, j) && grid[i-1][j] != 0) {
            res.add(grid[i-1][j]);
        }
        if(inArea(grid, i, j-1) && grid[i][j-1] != 0) {
            res.add(grid[i][j-1]);
        }
        return res;
    }
}
```