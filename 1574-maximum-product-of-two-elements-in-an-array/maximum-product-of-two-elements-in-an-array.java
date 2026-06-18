class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int b=nums.length;
        int a=nums[b-1]-1;
        int c=nums[b-2]-1;
        int ans=a*c;
        return ans;
    }
}