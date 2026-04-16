import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int len = citations.length;
        
        for(int i = 0; i<len; i++){
            int gap = len-i; 
            if(citations[i]>=gap)return gap;
        }
        
        return answer;
    }
}