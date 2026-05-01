import java.util.*;
class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        // cost 순으로 정렬 
        Arrays.sort(costs, (a1, a2) -> Integer.compare(a1[2],a2[2]));
        
        //초기 무리설정  
        int [] group = new int [n];
        for(int i =0; i<n; i++){
            group [i] = i; 
        }
        
        int count = 0; 
        //적은 비용부터 다리 짓기 
        for(int [] arr : costs){
            int b1 = arr[0];
            int b2 = arr[1];
            int cost = arr[2];
            
            //root 찾기 
            int leader1 = findLeader(b1,group);
            int leader2 = findLeader(b2,group);
            
            //같은 무리가 아니면 합치기
            if(leader1 != leader2){
                group[leader2] = leader1;
                answer += cost;
                count ++; //다리 count
            }
            if(count == n-1) return answer;
            
        }
        
        return answer;
    }
    
    public int findLeader (int node, int [] group){
       if(group[node] == node) return node;
        
        //찾은김에 root 넣어주기 
        group[node] = findLeader(group[node],group);
        
        return group[node];
    }
}