import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        //포인터 
        //무거운사람은 가벼운사람과 타야만 탈 수 있다(2명 인원제한) 
        
        int left = 0;
        int right = people.length-1;
        
        while(left <= right){
            int sum = people[left]+people[right];
            
            if(sum > limit){
                //무거운사람은 아무랑도 못탄다. 
                answer ++;
                right --; 
            }else{
                answer ++;
                left ++;
                right --; 
            }
            
        }
        
        return answer;
    }
}