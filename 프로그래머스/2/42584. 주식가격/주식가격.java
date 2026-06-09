import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        
        int len = prices.length;
        int[] answer = new int [len];
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        
        for(int i =1; i<len; i++){
            
            while(!stack.isEmpty()&& prices[stack.peek()]>prices[i]){ //떨어짐
                answer[stack.peek()] = i-stack.peek();
                stack.pop();  
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int idx = stack.pop();
            answer[idx] = (len - idx -1);
        }
        
        return answer;
    }
}