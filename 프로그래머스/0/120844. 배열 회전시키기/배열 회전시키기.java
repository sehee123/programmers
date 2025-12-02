class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int len = numbers.length;
        int[] answer = new int [len];
        
        int start = 0; 
        int end = len;
        int index = 1;
        
        if(direction.equals("right")){
            start = 1; 
            index = -1;
            answer[0] = numbers[len -1];
        }else{
            end = len-1;
            answer[len-1] = numbers[0];
        }
 
        for(int i = start; i<end; i++){
            answer [i] = numbers[i+index];
        }
        
        return answer;
    }
}