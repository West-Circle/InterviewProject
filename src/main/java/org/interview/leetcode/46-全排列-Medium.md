```java
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for(int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(0, n, output, res);
        return res;
    }

    public void backtrack(int first, int n, List<Integer> output, List<List<Integer>> res) {
        if(first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for(int i = first ; i < n ; i++) {
            //swap
            Collections.swap(output, first, i);
            backtrack(first + 1, n, output, res);
            //swap back again
            Collections.swap(output, first, i);
        }
    }
}
```