class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            boolean[] visited = new boolean[256];
            for(int j = i; j < s.length(); j++){
                if(visited[s.charAt(j)])
                    break;

                visited[s.charAt(j)] = true;
                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}