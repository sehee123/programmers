import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> duplCheck = new HashSet<>();
        
        for(String phone: phone_book){
            duplCheck.add(phone);
        }
        
        for(String phone: phone_book){
            for(int i =0; i<phone.length(); i++){
                if(duplCheck.contains(phone.substring(0,i)) == true){
                    return false;
                }
            }
        }
        return true;
    }
}