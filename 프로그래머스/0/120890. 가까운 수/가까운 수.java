import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        int gap = 100; 
        
        for(int i =0; i<array.length; i++){
            
            int abs = Math.abs(array[i]-n);
            
            if(gap<abs){
               break;
            }else if(gap == abs){
                
            }else {
                gap = abs;
                answer = array[i];
            }
            
           
        }
        
        return answer;
    }
}