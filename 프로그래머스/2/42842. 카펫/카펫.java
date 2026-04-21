class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        int sum = brown + yellow;
        for(int i=3;i<=sum; i++){
            if(sum%i==0){
                int division = sum/i; 
                if(division<3)continue;
                if((i-2)*(division-2) == yellow){
                    answer[0] = Math.max(division,i);
                    answer[1] = Math.min(division,i);
                    return answer;
                }
            }
        }
        
        return answer;
    }
}