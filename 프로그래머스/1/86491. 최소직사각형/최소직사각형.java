import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0; 
        int min = 0; 
        for(int i =0; i< sizes.length; i++){
            int max_val = Math.max(sizes[i][0],sizes[i][1]);
            int min_val = Math.min(sizes[i][0],sizes[i][1]);
            
            max = Math.max(max,max_val);
            min = Math.max(min,min_val);
        }
        
        return max*min;
    }
}