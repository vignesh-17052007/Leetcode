class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int a=nums.length/2;
        for(int i=1;i<nums.length;i+=2){
            if(nums[i]==nums[i-1])
           sum++;
          
    }
    return sum==a;
}
}