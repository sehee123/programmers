import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        
        String [] messageSplit = message.split(" ");
        
        Set<String> spoilerSet = new HashSet<>();
        Set<String> wordSet = new HashSet<>();
        
        int currentIdx = 0; 
        for(String word : messageSplit){
            
            int start = currentIdx;
            int end = currentIdx + word.length() -1;
            
            boolean isSpoiler = false;
            
            //spoiler_ranges 에 해당하는지 검사
            for(int [] range : spoiler_ranges){
               if(start <= range[1] && end >=range[0]){
                   isSpoiler = true;
                   break;
               }
            }
            
            if(isSpoiler){
                if(!wordSet.contains(word)){
                    spoilerSet.add(word);
                }
            }else{
                 if(!spoilerSet.contains(word)){
                    wordSet.add(word);
                }else{
                     spoilerSet.remove(word);
                     wordSet.add(word);
                 }
            }
            currentIdx += word.length() + 1;
            
        }
        
        return spoilerSet.size();
    }
}