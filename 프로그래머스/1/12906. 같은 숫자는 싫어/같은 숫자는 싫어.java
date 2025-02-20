import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
 
        Deque<Integer> deque = new LinkedList<>();
        
        for(int i = 0; i<arr.length ; i++){
            if(deque.isEmpty()){
                deque.offerLast(arr[i]);
            }else if(deque.peekLast() != arr[i]){
                deque.offerLast(arr[i]);
            }
        }
        int[] answer = new int [deque.size()];
        
        for(int i =0; i<answer.length;i++){
            answer [i] = deque.pollFirst(); 
        }
        return answer;
    }
}