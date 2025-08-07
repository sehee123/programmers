import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int len = nums.length;
        int max = len/2;
        int answer = 1;
        
        Arrays.sort(nums);
        
        for(int i =1; i<len; i++){
            if(answer == max)return answer;
            if(nums[i] != nums[i-1]){
                answer ++;
            }
        }
        
        return answer;
    }
}