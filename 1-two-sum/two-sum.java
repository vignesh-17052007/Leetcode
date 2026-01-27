import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i;
        int j;
        int sum = 0;
        int[] store = new int[2]; 

        for (i = 0; i < nums.length; i++) {

            for (j =  i+1; j < nums.length; j++) {

                sum = nums[i] + nums[j];

                if (sum == target) {
                    store[0] = i;
                    store[1] = j;
                    return store;
                }

            }
        }

        return store;
    }
}
