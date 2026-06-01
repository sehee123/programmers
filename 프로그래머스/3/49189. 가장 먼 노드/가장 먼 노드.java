import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        List<List<Integer>> nodeList = new ArrayList<>();
        int [] distance = new int [n+1];
        boolean [] visited = new boolean[n+1];
        
        for(int i = 0; i<=n; i++){
            nodeList.add(new ArrayList<Integer>());
        }
        
        for(int [] e : edge){
            int a = e[0];
            int b = e[1];
            
            nodeList.get(a).add(b);
            nodeList.get(b).add(a);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = true;
        
        while(!q.isEmpty()){
            int current = q.poll();
           
            List<Integer> nexts = nodeList.get(current);
            for(Integer next : nexts){
                
                if(!visited[next]){
                    visited[next] = true;
                    distance[next] = distance[current]+1;
                    q.offer(next);
                }
            }  
        }
        int max = 0;
        for(int i =1 ;i<=n; i++){
            int d = distance[i];
             System.out.println(d);
            max = Math.max(d, max);
        }
        
        for(int d : distance){
            if(max == d) answer++;
        }

        return answer;
    }
}