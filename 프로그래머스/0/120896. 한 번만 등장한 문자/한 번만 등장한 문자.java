import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        char [] charArray = s.toCharArray();
        Arrays.sort(charArray);
        for(int i =0; i<s.length(); i++){
           char c = charArray[i];
            if(s.indexOf(c) == s.lastIndexOf(c)){
                sb.append(c);
            }
        }

        return sb.toString();
        
    }
}