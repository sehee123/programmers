import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String [] result = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .sorted((a,b)-> (b+a).compareTo(a+b))
            .toArray(String[]::new);
        
        if(result[0].equals("0"))return "0";
        
        StringBuffer sb = new StringBuffer();
        for(String number : result){
            sb.append(number);
        }
        
        return sb.toString();
    }
}