

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //코테에서는 싱글스레드로 빠른 동작하는 StringBuilder() 사용 
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                sb.append(c);
                isFirst = true;
            }else{
                if(isFirst){
                    sb.append(Character.toUpperCase(c));
                }else{
                    sb.append(Character.toLowerCase(c));
                }
                isFirst = false;
            }
        }
        
        return sb.toString();
    }
}