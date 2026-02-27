import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        
        for(String operation : operations){
            String [] arr = operation.split(" ");
            if(arr[0].equals("I")){
                maxPq.add(Integer.parseInt(arr[1]));
                minPq.add(Integer.parseInt(arr[1]));
            }else{
                if(!maxPq.isEmpty()){
                    if(arr[1].equals("1")){
                        minPq.remove(maxPq.poll());
                    }else{
                        maxPq.remove(minPq.poll());
                    }
                }
                
            }
        }
        if(!maxPq.isEmpty()) return new int [] {maxPq.peek(), minPq.peek()};
        return answer;
    }
}