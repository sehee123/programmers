import java.util.*;

class Solution {
    public String solution(int[] numbers) {
       
        List<String> list = new ArrayList<>();
        for(int number: numbers){
            list.add(String.valueOf(number));
        }
        list.sort((s1,s2)-> {
          return (s2+s1).compareTo(s1+s2); 
        });
        
       
        StringBuilder sb = new StringBuilder();
        for(String num : list ){
            sb.append(num);
        }
        if(list.get(0).equals("0")) return "0";
        return sb.toString();
    }
}