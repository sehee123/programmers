import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> waitQ = new LinkedList<>();
        Queue<Integer> bridgeQ = new LinkedList<>();
        
        for(int t : truck_weights){
            waitQ.offer(t);
        }
        
        for(int i =0; i<bridge_length; i++){
            bridgeQ.offer(0);
        }
        
        int sum = 0;
        
        while(!waitQ.isEmpty() || sum >0){
            answer++;
            
            sum -= bridgeQ.poll();
            
            if(waitQ.isEmpty())continue;
            
            int t = waitQ.peek();
            if(sum + t <= weight && bridgeQ.size() < bridge_length ){
                waitQ.poll();
                bridgeQ.offer(t);
                sum += t;
            }else{
                bridgeQ.offer(0);
            }
            
        }
        
        
        return answer;
    }
}