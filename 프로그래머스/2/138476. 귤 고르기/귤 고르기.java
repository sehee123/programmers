import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer,Integer> map = new HashMap<>();   
        for(int t : tangerine){
            map.merge(t, 1 ,Integer::sum);
        }
        
        List<Integer> cntList = new ArrayList(map.values());
        List<Integer> sortedList = cntList.stream().sorted(Comparator.reverseOrder()).toList();
        
        int sum = 0;
        for(int i = 0; i<sortedList.size(); i++){
            int s = sortedList.get(i);
            if(s>= k) return 1; 
           
            sum+= s; 
            
            if(sum >= k){
               
                return i+1;
            }
        }
        
        
        
        return answer;
    }
}