```java
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int len = piles.length;
        int res = 0;
        for(int i = len / 3 ; i < len ; i+=2) {
            res += piles[i];
        }
        return res;
    }
}
```