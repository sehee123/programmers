import java.util.*;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        HashMap<String, String> win = new HashMap<>(); 
        win.put("2","0");
        win.put("0","5");
        win.put("5","2");
        
        String [] split = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(String str : split){
            sb.append(win.get(str));
        }
        
        return sb.toString();
    }
}