import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
              count++;
               i++;
            }
            if (count == arr[i]) {
             max = Math.max(max, count);
            }
        }
        return max;
    }
}