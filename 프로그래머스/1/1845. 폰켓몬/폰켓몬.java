import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> dulpCheck = new HashSet<>();
        for(int n : nums){
            dulpCheck.add(n);
            if(dulpCheck.size() == nums.length/2) return dulpCheck.size();
        }
        
        return dulpCheck.size();
    }
}