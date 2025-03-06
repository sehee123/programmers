import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        
        int sum = brown + yellow;
        
        for(int i = 1; i<=Math.sqrt(yellow); i++){
            if(yellow % i== 0){
                int height = i+2; 
                int width = (yellow/i)+2;
               
                if(height*width == sum){
                   return new int [] {width, height};
                } 
            }
        }
		return new int [0];
    }
}