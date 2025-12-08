import java.util.*;

class Solution {
    public long solution(String numbers) {
        
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        StringBuilder number = new StringBuilder();
        for(int i =0; i<numbers.length(); i++){
            char c = numbers.charAt(i);
            
            number.append(c);
            
            String key = number.toString();
            
            if(map.containsKey(key)){
                sb.append(map.get(key));
                number.setLength(0);
            }
        }

        return Long.parseLong(sb.toString());
    }
}