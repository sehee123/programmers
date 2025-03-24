import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        
        for(int [] e : edge){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        int [] distances = new int [n+1];
        Arrays.fill(distances, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        distances[1] = 0;
        queue.offer(1);
        
        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int next : graph.get(current)){
                if(distances[next] == -1){
                    distances[next] = distances[current] +1;
                    queue.offer(next);
                }
            }
        }
        
        int maxDist = 0 ,count = 0;
        for(int dist : distances){
            if(dist > maxDist){
                maxDist = dist;
                count = 1;
            }else if(dist == maxDist){
                count ++;
            }
        }
        
        return count;
    }
}