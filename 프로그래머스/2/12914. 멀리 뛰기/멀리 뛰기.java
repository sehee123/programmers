class Solution {
    public long solution(int n) {
    
        if(n == 1)return 1; 
        if(n == 2)return 2; 
        
        long answer = 0; 
        long first = 1L;
        long second = 2L;
        
        for(int i =2; i<n; i++){
            answer = (first + second) % 1234567;
            first = second;
            second = answer;
        }
        
        return answer;
    }
}