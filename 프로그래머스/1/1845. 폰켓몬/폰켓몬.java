import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        int limit  = nums.length/2;
        
        for(int num: nums){
            set.add(num);
            if(set.size() == limit)return limit;
        }
        
        return set.size();
    }
}