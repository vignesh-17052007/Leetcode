import java.util.Arrays;

class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];
        int a = gain.length + 1;

        ans[0] = 0;

        for(int i = 1; i < a; i++){
            ans[i] = ans[i-1] + gain[i-1];  // ✅ fixed logic
        }

        Arrays.sort(ans);  // (still unnecessary, but kept as per your code)
        return ans[ans.length - 1];
    }
}