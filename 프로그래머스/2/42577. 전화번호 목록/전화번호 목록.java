import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Map <String,Integer> phoneBook = new HashMap<>();
        for(String phone : phone_book){
            phoneBook.put(phone,0);
        }
        
        for(String phone : phone_book){
            for(int i = 0; i<phone.length(); i++){
                String subStr = phone.substring(0,i);
               
                if(phoneBook.getOrDefault(subStr,1) != 1){
                    return false;
                }
            }
        }
        
        
        return true;
    }
}