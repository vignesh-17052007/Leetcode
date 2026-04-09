class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean visited = false;
            for (int x = 0; x < i; x++) {
                if (nums[x] == nums[i]) {
                    visited = true;
                    break;
                }
            }
            if (visited) continue;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count % k == 0) {
                sum += nums[i] * count;
            }
        }

        return sum;
    }
}