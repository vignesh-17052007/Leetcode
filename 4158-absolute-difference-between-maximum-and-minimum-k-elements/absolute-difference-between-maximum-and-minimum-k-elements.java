class Solution {
    public int absDifference(int[] nums, int k) {
      Arrays.sort(nums);
      int sum_1=0;
      int sum_2=0;
      int a=nums.length-1;
      int ans=0;
      for(int i=0;i<k;i++){
        sum_1+=nums[i];
      }
      for(int j=0;j<k;j++){
        sum_2+=nums[a];
        a--;
      }
       ans=Math.abs(sum_2-sum_1);
         return ans;
    }
    
  
}