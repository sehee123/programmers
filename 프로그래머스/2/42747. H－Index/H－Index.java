import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int len = citations.length;
        // 5 6 7 8 
        for(int i =len; i>1; i--){
            if(citations[i-1] >=i && citations[len-i]>=i){
                answer = i;
                break;
            }
        }
        return answer;
    }
}