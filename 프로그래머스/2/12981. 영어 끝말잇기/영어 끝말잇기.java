import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i = 1 ; i< words.length; i++){

            String beforeWord = words[i-1].substring(words[i-1].length()-1);
            String afterWord = words[i].substring(0,1);

            if(!set.add(words[i]) || !beforeWord.equals(afterWord)){
                
                answer[0] = i%n+1;
                answer[1] = i/n+1 ; 
                   break;
            }

        }
        return answer;
    }
}