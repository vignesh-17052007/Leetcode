class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int[] arr = new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
               arr[i]=nums2[i]*k;
        }
        int count=0;
        for(int j=0;j<nums1.length;j++){
            for(int a=0;a<arr.length;a++){
                if(nums1[j]%arr[a]==0)
                count++;
            }
        }
        return count;
    }
}