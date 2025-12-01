class Solution {
    public String solution(int age) {
       
        
        String str = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i<str.length(); i++){
            int num = str.charAt(i) - '0';
            char c = (char)('a' + num);
            sb.append(c);
        }
        
        return sb.toString();
    }
}