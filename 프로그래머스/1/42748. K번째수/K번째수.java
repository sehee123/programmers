import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int commandLen = commands.length;
        int [] answer = new int [commandLen];
        
        for(int i = 0; i<commandLen; i++){
            int [] command = commands[i];
            
            int start = command[0];
            int end = command[1];
            int len = end-start+1;
            
            int [] newArray = new int [len];
            
            for(int j= 0; j<len; j++){
                newArray[j] = array[start-1+j];
            }
            Arrays.sort(newArray);
            
            answer[i] = newArray[command[2]-1];
        }
        return answer;
    }
}