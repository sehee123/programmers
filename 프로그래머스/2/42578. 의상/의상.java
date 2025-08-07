import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> categories = new HashMap<>();
        
        for(String cloth[]: clothes){
            categories.put(cloth[1], categories.getOrDefault(cloth[1],0)+1);
        }
        
        int answer = 1;
        for(String category: categories.keySet()){
            int cnt = categories.get(category);
            answer = answer *(cnt+1);
        }
        return --answer;
    }
}