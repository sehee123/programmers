class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age); 
        String [] arr = str.split("");
        
        for(int i =0; i<arr.length; i++){
            char c = (char)(97+Integer.parseInt(arr[i]));
            answer +=c;
        }
        
        
        return answer;
    }
}