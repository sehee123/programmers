import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        for(int []wire : wires){
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        int minDiff = Integer.MAX_VALUE; 
        
        for(int [] wire : wires){
            int nodeA = wire[0];
            int nodeB = wire[1];
            
            graph.get(nodeA).remove(Integer.valueOf(nodeB)); 
            graph.get(nodeB).remove(Integer.valueOf(nodeA));
            //remove(int idx);
            //remove(Object obj); 차이점 
            boolean [] visited = new boolean [n+1];
            int cnt = dfs(nodeA , graph,visited);
            
            int diff = Math.abs(n - cnt - cnt );
            minDiff = Math.min(minDiff , diff);
            
            graph.get(nodeA).add(nodeB); 
            graph.get(nodeB).add(nodeA);
        }
        
        
        return minDiff;
    }
    public static int dfs(int node , List<List<Integer>> graph , boolean [] visited){
        visited[node] = true;
        int cnt = 1; 
        
        for(int neighbor :graph.get(node)){
            if(!visited[neighbor]){
                cnt+=dfs(neighbor,graph,visited);
            }
        }
        
        return cnt ;
    }
}