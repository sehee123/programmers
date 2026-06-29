class Solution {
    public int[] solution(String s) {
        int[] answer = new int [] {0,0};
        
        while(!s.equals("1")){
            
            answer[0]++;
            
            int oneCnt = 0;
            int len = s.length();
            //0제거
            for(int i =0; i<len; i++){
                char c = s.charAt(i);
                if(c == '1'){
                    oneCnt ++;
                }
            }
            answer [1] += len - oneCnt ; 
           
            s = Integer.toBinaryString(oneCnt);

        }
        
        return answer;
    }
}