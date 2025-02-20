import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        int cnt = 0; 
        int maxDay = 0; 
        for(int i = 0; i<progresses.length; i++){
            int day = (100 -progresses[i])/speeds[i]; 
            if((100 -progresses[i])%speeds[i] != 0){
                day ++;
            }
            if(maxDay == 0)maxDay = day;
            if(maxDay >= day ){
                cnt ++;
            }else{
                maxDay = day;
                list.add(cnt);
                cnt = 1;
            }   
        }
        list.add(cnt);
        
        return list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
}