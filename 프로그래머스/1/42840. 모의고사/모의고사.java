import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
      
        
        int [] first = {1, 2, 3, 4, 5}; //5
        int [] second = {2, 1, 2, 3, 2, 4, 2, 5};//8
        int [] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        
        int [] correct = {0,0,0};
        
        for(int i =0; i<answers.length ; i++){
            
            int f = i;
            if(i>= 5)f%=5;
            if(answers[i] == first[f]){
                
                correct[0]++;
            }
            
            int s= i;
            if(s>= 8)s%=8;
            if(answers[i] == second[s]){
                correct[1]++;
            }
            
            int t= i;
            if(t>= 10)t%=10;
            if(answers[i] == third[t]){
                correct[2]++;
            }
            
            
        }
        
        int max = 0;
        for(int c: correct){
            max = Math.max(c,max);
        }
        List<Integer> result = new ArrayList<>();
        for(int i =0; i<3; i++){
            if(correct[i]==max)result.add(i+1);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}