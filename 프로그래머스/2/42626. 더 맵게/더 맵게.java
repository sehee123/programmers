import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>(); 
        
        for(int s : scoville){
            pq.offer(s);
        }
        
        while(pq.size()>1 && pq.peek() < K){
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b*2;
            pq.offer(sum);
            if(pq.size () == 1 && sum< K) return -1;
            answer ++;
        }
        
        return answer;
    }
}