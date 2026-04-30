import java.util.*;

class Solution {
    public String solution(String number, int k) {

        Deque<Integer> stack = new ArrayDeque<>();
        int cnt = 0;
        
        //맨 앞자리가 크면 장땡 
        for(int i = 0; i<number.length(); i++){
            int num = number.charAt(i) - '0';
            
            while(!stack.isEmpty() && cnt < k && stack.peek()<num){
                stack.pop();
                cnt++;
            }
            
            stack.push(num); 
        }
        
        while(cnt<k){
            stack.pop();
            cnt++;
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }
        
        return sb.toString();
    }
}