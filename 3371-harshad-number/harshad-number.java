class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int ans=0;
        while(a>0){
           int temp=a%10;
            ans+=temp;
            a=a/10;

        }
        if(x%ans==0)
        return ans;
        else 
        return -1;

    }
}