import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        
        PriorityQueue <Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue <Integer> minPQ = new PriorityQueue<>();
        
        for(String str : operations){
            
            String [] arr = str.split(" "); 
            
            if(arr[0].equals("I")){
                int num = Integer.parseInt(arr[1]);
                
                maxPQ.offer(num);
                minPQ.offer(num);
            }else{
                if(!maxPQ.isEmpty()){  
                    if(arr[1].equals("1")){
                        int max = maxPQ.poll();  
                        minPQ.remove(max);
                    }else {
                        int min = minPQ.poll();  
                        maxPQ.remove(min);
                    }
                }
                
            }
        }
        if(!maxPQ.isEmpty())answer[0]=maxPQ.peek();
        if(!minPQ.isEmpty())answer[1]=minPQ.peek();
        return answer;
    }
}