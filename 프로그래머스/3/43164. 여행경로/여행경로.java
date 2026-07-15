import java.util.*;

class Solution {
    List<String> answer;
    Map<String,PriorityQueue<String>> map;
    public String[] solution(String[][] tickets) {
       
        answer = new ArrayList<>();
        map = new HashMap<>();
        
        for(String [] ticket : tickets){
            map.computeIfAbsent(ticket[0],t-> new PriorityQueue<>()).offer(ticket[1]);
        }
        
        dfs("ICN");
        
        return answer.toArray(new String[0]);
    }
    
    public void dfs(String start){
        PriorityQueue<String> q = map.get(start);
        
        while(q !=null && !q.isEmpty()){
            String next = q.poll();
            dfs(next);
        }
        answer.add(0,start);
    }
}