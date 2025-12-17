class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        
        for(int i =0; i<numbers.length; i++){
            for(int j =0; j<i; j++){
                int multiply = numbers[i] *numbers[j]; 
                answer = Math.max(multiply, answer);
            }
        }
        
        return answer;
    }
}