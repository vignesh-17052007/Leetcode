class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=nums[nums.length-1];
        int sum=ans;
        
        for(int i=1;i<k;i++){
            sum+=ans+i;
            
        }
           return sum;
    }
 
}