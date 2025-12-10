import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i =0; i<numlist.length; i++){
            int num = numlist[i];
            if(num % n == 0)list.add(num);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}