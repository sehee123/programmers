class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i<my_string.length(); i++){
            
            char c = my_string.charAt(i);
            
            int ascii = (int)c;
            
            if(ascii >= 65 && ascii<= 90){
                ascii += 32;
            }else {
                 ascii -= 32;
            }
           
            sb.append((char)(ascii));
        }
        
        return sb.toString();
    }
}