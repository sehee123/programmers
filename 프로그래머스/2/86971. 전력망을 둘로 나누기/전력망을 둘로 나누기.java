import java.util.*;

class Solution {
    boolean [] visited; 
   
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        Map<Integer, List<Integer> > wireMap = new HashMap<>();
        
        for(int[] wire : wires){
            List<Integer> list = new ArrayList<>();
            wireMap.computeIfAbsent(wire[0],k -> new ArrayList<>()).add(wire[1]);
            wireMap.computeIfAbsent(wire[1],k -> new ArrayList<>()).add(wire[0]);
        }
        
        
        
        for(int[]wire:wires){
            wireMap.put(wire[0],removeFromList(wire[1],wireMap.get(wire[0])));
            wireMap.put(wire[1],removeFromList(wire[0],wireMap.get(wire[1])));
            
            visited = new boolean [n+1];
            
            int count = dfs(1,wireMap);
            
            answer = Math.min(answer , Math.abs(count - (n-count)));
            
            wireMap.put(wire[0],addFromList(wire[1],wireMap.get(wire[0])));
            wireMap.put(wire[1],addFromList(wire[0],wireMap.get(wire[1])));     
        }
    
        return  answer;
    }
    
    public int dfs(int start , Map<Integer,List<Integer>> wireMap){
        List<Integer> nodeList = wireMap.get(start);
        visited[start] = true;
        int count = 1;
        
        for(Integer node : nodeList){
            if(!visited[node]){
                count += dfs(node, wireMap);
            }
        }
        
        return count;
    }
    
    public List<Integer> removeFromList(int node, List<Integer> nodeList){
        nodeList.remove(Integer.valueOf(node));
        return nodeList;
    }
    
    public List<Integer> addFromList(int node, List<Integer> nodeList){
        nodeList.add(node);
        return nodeList;
    }
    
    
}