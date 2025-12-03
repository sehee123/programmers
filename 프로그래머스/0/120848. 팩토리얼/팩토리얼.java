class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        
        for(int i =1; i<=10; i++){
            num *=i;
            if(num > n){
                answer = i -1;
                break;
            }else if(num == n){
                answer = i;
                break;
            }
            
        }
        
        
        return answer;
    }
}