import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> checkMap = new HashMap<>();
        for(String p : participant){
            checkMap.put(p, checkMap.getOrDefault(p,0)+1);
        }
        
        for(String c : completion){
            int count = checkMap.get(c);
            if(count ==1){
                checkMap.remove(c);
            }else{
                checkMap.put(c, count-1);
            }
        }
        
        for(String key : checkMap.keySet()){
            answer = key;
        }
        
        return answer;
    }
}