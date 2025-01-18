```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) {
            return new ArrayList<Integer>();
        }
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        Integer[] res = new Integer[(r+1) * (b+1)];
        while(true) {
            for(int i = l ; i <= r ; i++) {
                res[x] = matrix[t][i]; //left to right
                x++;
            }
            if(++t > b) {
                break;
            }
            for(int i = t ; i <= b ; i++) {
                res[x] = matrix[i][r]; //top to bot
                x++;
            }
            if(--r < l) {
                break;
            }
            for(int i = r ; i >= l ; i--) {
                res[x] = matrix[b][i]; // right to left
                x++;
            }
            if(--b < t) {
                break;
            }
            for(int i = b ; i >= t ; i--) {
                res[x] = matrix[i][l]; // bot to top
                x++;
            }
            if(++l > r) {
                break;
            }
        }
        return Arrays.asList(res);
    }
}
```