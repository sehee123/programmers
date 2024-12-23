import java.util.ArrayList;
import java.util.List;

class Solution {
    
    static List<boolean []> visitedList = new ArrayList<>();
    
    public int solution(int n, int[][] wires) {
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0 ; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int [] wire : wires){
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        for(int i = 0; i<wires.length; i++){
            visitedList.add(new boolean[n+1]);
            graph.get(wires[i][0]).remove(Integer.valueOf(wires[i][1]));
            graph.get(wires[i][1]).remove(Integer.valueOf(wires[i][0]));
            dfs(1,graph, i);
            graph.get(wires[i][0]).add(Integer.valueOf(wires[i][1]));
            graph.get(wires[i][1]).add(Integer.valueOf(wires[i][0]));
        }
        
        int num = Integer.MAX_VALUE;
        
        for(boolean [] arr : visitedList){
            int nodeCnt = 0 ;
            for(int i = 0 ; i<arr.length; i++){
                if(arr[i]){
                    nodeCnt ++ ;
                }
            }
            int abs = Math.abs(n - (2*nodeCnt));
            if(abs < num){
                num = abs;
            }
        }
        
        return num;
    }
    
    public static void dfs(int node,List<List<Integer>> graph, int idx ){
        visitedList.get(idx)[node] = true;

        for(int neighbor : graph.get(node)){
            if(!visitedList.get(idx)[neighbor]){
                dfs(neighbor,graph,idx);
            }
        }
    }
    
}