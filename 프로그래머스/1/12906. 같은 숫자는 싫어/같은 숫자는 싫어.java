import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        List<Integer> duplRemoveList = new ArrayList<>();
        duplRemoveList.add(arr[0]);
        
        for(int i =0; i<arr.length;i++){
            if(arr[i] != duplRemoveList.get(duplRemoveList.size()-1)){
                duplRemoveList.add(arr[i]);
            }
        }
        
        return duplRemoveList.stream().mapToInt(i->i).toArray();
    }
}