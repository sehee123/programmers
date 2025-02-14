import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length; 
        Set<Integer> set =new HashSet<>();
        for(int i = 0; i<size ; i++){
            if(set.size() ==size/2)break;
            set.add(nums[i]);
        }
        answer = set.size();
        return answer;
    }
}