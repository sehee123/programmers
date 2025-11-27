class Solution {
    public int[] solution(int n) {
        
        int size = 0;
        
        if(n % 2 == 0){
            size = n /2;
        }else{
            size = n/2 +1;
        }
        
        int [] answer = new int [size];
        int num = 1;
        
        for(int i = 0; i<size; i++){
            answer[i] = num;
            num = num +2;
        }
        
        
        return answer;
    }
}