import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        
        int len = emergency.length;
        int [] copy = Arrays.copyOf(emergency, len);
        
        int[] answer = new int [len];
        
        Arrays.sort(emergency);
        int max = emergency[len - 1];
        
        int [] pointer = new int [max+1];
        
        for(int i =0; i<len; i++){
            pointer[emergency[i]] = len-i;
        }
        
        for(int i =0; i<len; i++){
            answer[i] = pointer[copy[i]];
        }
        
        return answer;
    }
}