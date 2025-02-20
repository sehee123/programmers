import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i<numbers.length; i++){
             list.add(String.valueOf(numbers[i]));
        }
        list.sort((s1,s2) -> (s2+s1).compareTo(s1+s2));
        StringBuilder sb = new StringBuilder();
        for(String str : list){
            sb.append(str);
        }
        if(list.get(0).equals("0")){
            return "0";
        }
        return sb.toString();
    }
}