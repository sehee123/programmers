import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> answer = new ArrayList<>();
        
        int [] days = new int [progresses.length];
        
        for(int i = 0; i<progresses.length; i++){
            int day = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0) day++;    
            days[i] = day;
        }
        
        int workCount = 1;
        int maxDay = days[0];
        for(int i =1; i<days.length; i++){
            if(maxDay>=days[i]){
                workCount ++;
            }else{
                answer.add(workCount);
                workCount = 1;
                maxDay = days[i];
            }
        }
        answer.add(workCount);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}