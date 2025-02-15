import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i<phone_book.length; i++){
            map.put(phone_book[i],0);
        }
        for(int i = 0; i<phone_book.length; i++){
            for(int j = 1; j<phone_book[i].length(); j++){
                if(map.getOrDefault(phone_book[i].substring(0,j),1) == 0){
                    return false;
                }
            }
        }
        return true;
    }
}