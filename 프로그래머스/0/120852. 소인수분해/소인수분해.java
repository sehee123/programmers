import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        int divisor = 2;
        while(n>1){
            if(n % divisor == 0){
                n /= divisor; 
                list.add(divisor);
            }else{
                divisor ++ ;
            }
        }
        
        return list.stream().distinct().mapToInt(c->c).toArray();
    }
}