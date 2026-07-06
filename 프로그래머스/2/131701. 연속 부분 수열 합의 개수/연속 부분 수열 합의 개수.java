import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
       
        Set<Integer> set = new HashSet<>();
        int totalSum = 0; 
        for(int i =0; i<len; i++){
            int sum = 0; 
            for(int j =0; j<len-1; j++){
                int idx = i+j;
                if(idx >= len)idx-=len;
                sum += elements[idx];
                set.add(sum);
                
            }
            totalSum += elements[i];
        }
        set.add(totalSum);
        return set.size();
    }
}