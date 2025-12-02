import java.util.*;

class Solution {
    public String solution(String letter) {
       
        String [] morseArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
        
        HashMap <String,Character> morseMap = new HashMap<>();
        
        for(int i =0; i<morseArr.length; i++){
            morseMap.put(morseArr[i],(char)('a'+i));
        }
        
        String [] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder(); 
        
        for(String str : arr){
            sb.append(morseMap.get(str));
        }
        
        return sb.toString();
    }
}