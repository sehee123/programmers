import java.util.* ;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville)pq.add(s);
        
        while(pq.size() >1 && pq.peek()<K){
            int a = pq.poll();
            int b = pq.poll();
            int mixed = a + (2*b);
            pq.add(mixed);
            answer++;
        }
        
       return (pq.peek() >= K ) ? answer : -1;
    }
}