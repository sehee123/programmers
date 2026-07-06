import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String,Integer> wantMap = new HashMap<>();
        for(int i =0; i<want.length; i++){
            wantMap.put(want[i],number[i]);
        }
        
        //1~10일치 담기 
        Map<String,Integer> discountMap = new HashMap<>();
        for(int i = 0; i<10; i++){
            String discountItem = discount[i];
            if(wantMap.containsKey(discountItem)){
                discountMap.put(discountItem, discountMap.getOrDefault(discountItem,0)+1);
            }
        }
        
        if(wantMap.equals(discountMap))answer ++;
        
        for(int i =1; i<discount.length; i++){

            String prevItem = discount[i-1];

            if(wantMap.containsKey(prevItem)){
                int itemCount = discountMap.getOrDefault(prevItem,0);
                if(itemCount <2){
                    discountMap.remove(prevItem);
                }else{
                    discountMap.put(prevItem, itemCount-1);
                }
            }
            
            if(i+9 < discount.length){
                String nextItem = discount[i+9];
                if(wantMap.containsKey(nextItem)){
                    discountMap.put(nextItem, discountMap.getOrDefault(nextItem,0)+1);
                }
            }
            if(wantMap.equals(discountMap))answer ++;
        }
        
    
        
        return answer;
    }
}