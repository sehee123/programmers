import java.util.*; 
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> categoryCnt = new HashMap<>();
        for(int i = 0; i< clothes.length; i++){
            int cnt = categoryCnt.getOrDefault(clothes[i][1],0);
            categoryCnt.put(clothes[i][1], cnt+1);
        }
        
        for(String key : categoryCnt.keySet()){
            answer *=(categoryCnt.get(key)+1);
        }
        return answer-1;
    }
}