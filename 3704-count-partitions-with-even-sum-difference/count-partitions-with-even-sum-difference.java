class Solution {
    public int countPartitions(int[] nums) {
        int count =0;
        int sum_1=0;
        
        for(int i=0;i<nums.length-1;i++){
            sum_1= sum_1+nums[i];
            int sum_2=0;
            for(int j=i+1;j<nums.length;j++){
               sum_2= sum_2+nums[j];
        }
            if((sum_1-sum_2)%2==0)
            count++;
    }
     return count;
    }
   
}