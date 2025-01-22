```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for(int end = 0 ; end < n ; end++) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                start = Math.max(start, map.get(c));
            }
            res = Math.max(res, end - start + 1);
            map.put(c, end+1);
        }
        return res;
    }
}
```