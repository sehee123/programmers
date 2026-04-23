import java.util.*;

class Solution {
    int count = 0;
    int answer = 0;
    String target;
    public int solution(String word) {
        
        target = word;
        String [] alphabet = {"A","E","I","O","U"};
        dfs(alphabet , "");
        
        return answer;
    }
    
    public void dfs (String[] alphabet, String comb){
        
         if(comb.equals(target)){
            answer = count;
            return;
        }
        
        if(comb.length()==5) return;
       
        for(int i = 0; i<5; i++){
           
            count++;
            dfs(alphabet, comb+alphabet[i]);
            
        }
    } 
}