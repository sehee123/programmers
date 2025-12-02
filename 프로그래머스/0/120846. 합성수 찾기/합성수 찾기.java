class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i =4; i<=n; i++){
            if(!isPrimeNumber(i))answer ++;
        }
        
        return answer;
    }
    
    public boolean isPrimeNumber(int num){

        for(int i =2; i<=Math.sqrt(num); i++){
            if(num % i ==0)return false;
        }
        return true;
    }
}