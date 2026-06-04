import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<priorities.length; i++){
            pq.offer(priorities[i]);
            q.offer(i);
        }
        
        int count = 0; 
        while(!q.isEmpty()){
            int max = pq.peek();
            if(priorities[q.peek()] < max){
                int p = q.poll();
                q.offer(p);
            }else{
                count ++;
                int idx = q.poll();
                pq.poll();
                if(idx == location) return count;
            }
        }
        
        
        return answer;
    }
}