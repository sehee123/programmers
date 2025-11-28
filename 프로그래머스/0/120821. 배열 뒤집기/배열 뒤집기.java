class Solution {
    public int[] solution(int[] num_list) {
        
        int len = num_list.length;
        int[] answer = new int [len];
        int j = len;
        for(int i = 0; i<len; i++){
            j--;
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}