``` java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        if(s.length() == 0) return 0;
        int max = 0;
        int left = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
```