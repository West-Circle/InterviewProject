```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if(matrix.length == 0) {
            return list;
        }
        int l = 0, r = matrix[0].length-1, t = 0, b = matrix.length-1;
        while(true) {
            for(int i = l ; i <= r ; i++) {
                list.add(matrix[t][i]);
            }
            if(++t > b) {
                break;
            }
            for(int i = t ; i <= b ; i++) {
                list.add(matrix[i][r]);
            }
            if(--r < l) {
                break;
            }
            for(int i = r ; i >= l ; i--) {
                list.add(matrix[b][i]);
            }
            if(--b < t) {
                break;
            }
            for(int i = b ; i >= t ; i--) {
                list.add(matrix[i][l]);
            }
            if(++l > r) {
                break;
            }
        }
        return list;
    }
}
```