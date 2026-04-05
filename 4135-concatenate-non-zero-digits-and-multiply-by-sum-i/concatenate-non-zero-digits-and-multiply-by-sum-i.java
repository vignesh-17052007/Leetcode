class Solution {
    public long sumAndMultiply(int n) {
        int val = n;
        long num = 0;  
        long sum = 0;
        while (val > 0) {
            int d = val % 10;
            if (d != 0) {
                num = num * 10 + d;
                sum += d;
            }
            val /= 10;
        }
        long correct = 0;

        while (num > 0) {
           long temp2=num%10;
            correct = correct * 10 +temp2;
            num /= 10;
        }
        return correct * sum; 
    }
}