import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
             char firstC = s.charAt(0);
             if(firstC == ')' || firstC == '}' || firstC==']'){
                 s = sliceString(s);
                 continue;
             }
            
            Deque<Character> stack = new ArrayDeque<>();
            
            for(int j =0; j<s.length(); j++){
                
                char c = s.charAt(j);
                
                if(c == ')' || c == '}' || c==']'){
                    if(!stack.isEmpty()){
                        char lastC = stack.peek();
                        if((lastC == '(' && c == ')') ||
                          (lastC == '[' && c == ']') ||
                           (lastC == '{' && c == '}')
                          ){
                            stack.pop();
                        }
                    }
                }else{
                    stack.push(c);
                }
            }
            if(stack.isEmpty())answer++;
            s = sliceString(s);
        }
        
        return answer;
    }
    
    public String sliceString(String str){
        
        StringBuilder sb = new StringBuilder ();
        sb.append(str.substring(1,str.length()));
        sb.append(str.substring(0,1));
        return sb.toString();
    }
}