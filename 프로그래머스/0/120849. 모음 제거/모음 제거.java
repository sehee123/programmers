import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String [] arr = my_string.split("");
        for(String str : arr){
            switch(str){
                case "a" :  
                    str = "";
                case "e" :  
                     str = "";
                case "i" :  
                     str = "";
                case "o" :  
                     str = "";
                case "u" :  
                    str = "";
                break;
            }
            sb.append(str);
        }
        
        
        return sb.toString();
    }
}