import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Deque<Character> stack = new ArrayDeque<>();
        stack.push(s.charAt(0));
        
        for(int i =1;i<s.length(); i++){
            char c = s.charAt(i);
            boolean isSame = false;
            
            if(!stack.isEmpty()){
                char prev = stack.peek();
                if(prev == c){
                    stack.pop();
                    isSame = true;
                }
            }
            
            if(!isSame){
                stack.push(c);
            }
            
        }
        

        return stack.isEmpty()?1:0;
    }
}