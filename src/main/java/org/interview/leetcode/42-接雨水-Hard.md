```java
class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int left = 1;
        int right = height.length - 2;
        for(int i = 1 ; i < height.length - 1 ; i++) {
            //从左到右
            if(height[left-1] < height[right+1]) {
                maxLeft = Math.max(maxLeft, height[left-1]);
                int min = maxLeft;
                if(min > height[left]) {
                    sum = sum + (min - height[left]);
                }
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right+1]);
                int min = maxRight;
                if(min > height[right]) {
                    sum = sum + (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}
```