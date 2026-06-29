class Solution {
    public int[] solution(String s) {
        int[] answer = new int [] {0,0};
        
        while(!s.equals("1")){
            
            answer[0]++;
            
            StringBuilder sb = new StringBuilder();
            //0제거
            for(int i =0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c == '1'){
                    sb.append("1");
                }else{
                    answer[1]++;
                }
            }
         
            int len = sb.toString().length();
            int a = 0;
            int b = 0; 
            
            String binary = "";
            while(len > 0){
                b = len % 2; 
                len /= 2;
                binary = b+ binary;
            }
            
            s = binary;
        }
        
        return answer;
    }
}