import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        
        int index = 0; 
        int max = 0;
        
        for(int i =0; i<array.length; i++){
            int tmp = Math.max(max,array[i]);
            if(tmp !=max){
                max = tmp;
                index = i;
            }
        }
        
        return new int []{max, index};
    }
}