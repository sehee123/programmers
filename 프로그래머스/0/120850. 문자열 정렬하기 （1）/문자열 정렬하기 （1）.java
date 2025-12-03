import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        
        List <Integer> numList = new ArrayList<>();
        
        for(int i =0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c  < 96) numList.add(c-'0');
        }
        Collections.sort(numList);
        
        int [] answer = new int [numList.size()];
        
        for(int i =0; i<answer.length; i++){
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}