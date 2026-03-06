import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        Queue<String []> q = new LinkedList<>();
        q.offer(new String []{begin, "0"});
        
        boolean [] visited = new boolean [words.length];
        
        while(!q.isEmpty()){
            String [] arr = q.poll();
            String current = arr[0];
            
            int cnt = Integer.parseInt(arr[1]);
           
            if(target.equals(current))return cnt;
            
            for(int i = 0; i<words.length; i++){
                if(visited[i])continue;
               
                String word = words[i];
                int diff = 0; 
                for(int j = 0; j<word.length(); j++){
                    if(current.charAt(j) != word.charAt(j)){
                        diff ++; 
                    }
                }
                
                if(diff == 1){
                    q.offer(new String []{word,  String.valueOf(++cnt)});
                    visited[i] = true; 
                }
            }
        }
        
        return answer;
    }
}