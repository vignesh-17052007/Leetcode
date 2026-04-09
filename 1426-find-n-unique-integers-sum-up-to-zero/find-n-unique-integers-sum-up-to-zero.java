class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int j = 1;
        if (n % 2 != 0) {
            ans[0] = 0; 
        }
        for (int i = (n % 2 == 0 ? 0 : 1); i < n; i += 2) {
            ans[i] = -j;
            ans[i + 1] = j;
            j++;
        }

        return ans;
    }
}