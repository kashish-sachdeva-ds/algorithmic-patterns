class Solution {
    public int rangeSum(int[] nums, int l, int r) {

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        // Build prefix sum
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Range sum
        if (l == 0) {
            return prefix[r];
        }

        return prefix[r] - prefix[l - 1];
    }
}