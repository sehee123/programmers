import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        List<List<Node>> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            list.add(new ArrayList<>());
        }
        
        for(int [] cost : costs){
            list.get(cost[0]).add(new Node(cost[1],cost[2]));
            list.get(cost[1]).add(new Node(cost[0],cost[2]));
        }
        
        
        boolean [] visited = new boolean [n];
        
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparing(Node::cost));
        //0에서 시작 
        pq.offer(new Node(0, 0));
        while(!pq.isEmpty()){
            Node next = pq.poll();
            
            if(visited[next.idx]){
                continue;
            }
            
            visited[next.idx] = true;
            answer += next.cost;
            
            for(Node node : list.get(next.idx)){
                pq.offer(node);
            }
        }
        
        return answer;
    }
    
    record Node(int idx, int cost){}
}
