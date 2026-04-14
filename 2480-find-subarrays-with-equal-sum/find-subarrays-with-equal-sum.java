class Solution {
    public boolean findSubarrays(int[] nums) {
        
        for(int i = 0; i < nums.length - 1; i++){
            int sum_1 = nums[i] + nums[i+1];
            for(int j = i + 1; j < nums.length - 1; j++){
                int sum_2 = nums[j] + nums[j+1];  
                if(sum_1 == sum_2){
                    return true;
                }
            }
        }
        
        return false;
    }
}