import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> cntStack = new Stack<>();
        for(int i = 0; i<progresses.length;i++){
            int day = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i] != 0){
                day++;
            }
            if(stack.isEmpty()){
                stack.push(day);
                cnt++;
                cntStack.push(cnt);
            }else if(stack.peek() >= day){
                cnt++;
                cntStack.pop();
                cntStack.push(cnt);
            }else if(stack.peek() < day){
                list.add(cnt);
                cnt = 1;
                cntStack.push(cnt);
                stack.push(day);
            }
        }
        return cntStack.stream()
                    .mapToInt(Integer::intValue).toArray();
    }
}