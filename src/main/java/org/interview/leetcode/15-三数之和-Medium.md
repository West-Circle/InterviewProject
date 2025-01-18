```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0) {
            return res;
        }
        for(int i = 0 ; i < len ; i++) {
            if(nums[i] > 0) {
                break; //第一个数字一定为 < 0
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue; //去重
            }
            int l = i+1;
            int r = len - 1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while(l < r && nums[l] == nums[l+1]) {
                        l++; //去重
                    }
                    while(l < r && nums[r] == nums[r-1]) {
                        r--; //去重
                    }
                    l++;
                    r--;
                } else if(sum > 0) {
                    r--;
                } else if(sum < 0) {
                    l++;
                }
            }
        }
        return res;
    }
}
```