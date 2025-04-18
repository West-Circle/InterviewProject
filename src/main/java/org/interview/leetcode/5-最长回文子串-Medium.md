中心扩散法
```java
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxStart = 0;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            // j = 0 表示中心节点只有 i，即回文串中心是单个字符；
            // j = 1 表示中心节点有两个 i 和 i + 1，即回文串中心是两个字符
            for (int j = 0; j <= 1; j++) {
                // 左指针，初始指向中心位置
                int l = i;
                // 右指针，根据 j 的值确定初始位置
                int r = i + j;
                // 当左右指针在字符串范围内且对应字符相等时，继续向两边扩展
                while (l >= 0 && r < n&& s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                // 回溯到回文字符串的起始和结束位置
                // 因为上面的 while 循环结束时，l 和 r 已经越界了，所以要回退一步
                l++;
                r--;
                // 比较当前找到的回文子串长度和之前记录的最长回文子串长度
                if (maxLength < r - l + 1) {
                    maxLength = r - l + 1;
                    maxStart = l;
                }
            }
        }
        return s.substring(maxStart, maxStart + maxLength);
    }
}
```