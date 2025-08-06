import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        
        Set<Integer> typeCnt = new HashSet<>();
        
        for(int n : nums){
            typeCnt.add(n);
            if(typeCnt.size() == nums.length/2){
                return nums.length/2;
            }
        }
        
        return typeCnt.size();
    }
}