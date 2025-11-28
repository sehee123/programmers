class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String arr [] = my_string.split("");
        for(String str : arr){
            for(int i = 0; i<n; i++){
                answer += str;
            }
        }
        
        return answer;
    }
}