import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        
       int answer = 0;

      List<Integer> list = new ArrayList<>();
		
		for(int i=0; i< nums.length; i++) {
			for(int j = 0; j<i ; j++) {
				for(int k=0; k<j ; k++) {
					list.add(nums[i]+nums[j]+nums[k]);
				}
			}
		}
		for(int sum : list) {
            answer ++ ;
			for(int i=2;i<sum;i++) {
				if(sum%i == 0) {
					answer --;
					break;
				}
			}
		}

        return answer;
    }
}