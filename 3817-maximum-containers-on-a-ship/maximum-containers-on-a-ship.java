class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        long totalCapacity = n * n;   
        long allowedByWeight = maxWeight / w; 
        
        return (int) Math.min(totalCapacity, allowedByWeight);
    }
}


