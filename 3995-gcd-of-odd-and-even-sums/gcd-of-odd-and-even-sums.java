class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=0;
        int b=0;
        int c=n*2;
        for(int i=1;i<=c;i++){
            if(i%2==0)
            a+=i;
            else
            b+=i;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
