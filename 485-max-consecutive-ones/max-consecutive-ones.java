
 class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int count_1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            } else {
                if(count > count_1){
                    count_1 = count;
                }
                count = 0;
            }
        }
        if(count > count_1){
            count_1 = count;
        }

        return count_1;
    }
}