import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
      
        int pattern [][] = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        } ;
    
        int [] scores = new int [pattern.length];
        
        for(int i =0; i<answers.length ; i++){
            for(int j =0; j<pattern.length; j++){
                if(answers[i] == pattern[j][i%pattern[j].length])scores[j]++;
            }
            
        }
        
       int maxScore = Math.max(scores[0],Math.max(scores[1],scores[2]));
        
        List<Integer> result = new ArrayList<>();
        for(int i =0; i<scores.length; i++){
            if(scores[i]==maxScore)result.add(i+1);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}