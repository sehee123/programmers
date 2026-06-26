import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        
        //최소공배수 구하기 
        int lcm = signals[0][0] + signals[0][1] + signals[0][2];
        for(int i = 1; i<signals.length; i++){
            int newSum = signals[i][0] + signals[i][1] + signals[i][2];
            lcm = getLcm(lcm, newSum);
        }
        
        int currentTime = 0;
        while(currentTime <= lcm){
            boolean allYellow = true;
            
            for(int [] signal : signals){
                int green = signal[0];
                int yellow = signal[1];
                int red = signal[2];
                
                int cycle = green + yellow + red;
                int start = green;
                int end = start + yellow;
                
                int divison = currentTime % cycle;
                
                if(!(divison > start && divison <= end)){
                    allYellow = false;
                    break;
                }
            }
            if(allYellow){
                
                return currentTime;
            }
            
            currentTime ++;
        }
        
        return -1;
    }
    
    public int getGcd(int a, int b){
        while(b!=0){
            int r = a % b; 
            a = b; 
            b = r;
        }
        return a;
    }
    
    public int getLcm(int a, int b){
        return (a * b) / getGcd(a,b);
    }
}