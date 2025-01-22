```java
class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        for(int i = 0 ; i < len ; i++){
            dp[i][i] = true;
        }
        char[] charArr = s.toCharArray();

        for(int l = 2 ; l <= len ; l++) {
            for(int i = 0 ; i < len ; i++) {
                int j = l + i - 1; // j - i + 1 = L
                if(j >= len) {
                    break;
                }
                
                if(charArr[i] != charArr[j]) {
                    dp[i][j] = false;
                } else {
                    //dp[i][j] == true
                    if(j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }

                if(dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
```