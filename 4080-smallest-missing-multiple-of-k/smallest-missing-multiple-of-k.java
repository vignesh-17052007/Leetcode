class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] % k == 0) {
                ans[j] = nums[i];
                j++;
            }
            i++;
        }

        Arrays.sort(ans);
        int expected = k;
        for (int l = 0; l < ans.length; l++) {
            if (ans[l] == expected) {
                expected += k;   
            } else if (ans[l] > expected) {
                return expected; 
            }
        }

        return expected; 
    }
}