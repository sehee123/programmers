import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i= 1; i<=cipher.length()/code; i++){
            sb.append(cipher.charAt(code*i-1));
        }
        
        return sb.toString();
    }
}