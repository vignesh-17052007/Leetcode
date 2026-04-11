class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        int count=0;
        int a=salary.length-1;
        for(int i=1;i<a;i++){
        sum+=salary[i];
        count++;
        }
        return sum/count;

    }
}