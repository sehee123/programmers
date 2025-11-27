import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int len = array.length;
        
        int [] maxArr = new int [array[len-1]+1] ;
        
        for(int i = 0; i<len; i++){
            maxArr[array[i]] = maxArr[array[i]]+1;
        }
        
        int count = 0;
        
         for(int i = 0; i<maxArr.length; i++){
            
            int curMax = maxArr[i];
             
            if(curMax == count){
                answer = -1;
            }else if(curMax> count){
                answer = i;
                count = curMax;
            }
        }
        
        return answer;
    }
}