import java.util.*;

class Solution {
    List<String> answer = new ArrayList<>();
    //출발지별 목적지 자동정렬해서 넣기 
    Map<String, PriorityQueue<String>> flights = new HashMap<>();
    public String[] solution(String[][] tickets) {
        
        for(String [] ticket : tickets){
            flights.computeIfAbsent
                (ticket[0], t-> new PriorityQueue<>()).add(ticket[1]);
            }
        String start = "ICN";

        dfs(start);
        
        return answer.toArray(new String[0]);
    }
    public void dfs(String start){
            
            PriorityQueue<String> pq= flights.get(start);
            while(pq != null &&!pq.isEmpty()){
                 String destination = pq.poll();
                 dfs(destination);
            }
        //while문이 끝나야 티켓을 다 쓴 것.
        //역순으로 add 해주기 -> visited 필요 없다
            answer.add(0,start);
            
    }
}