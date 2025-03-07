import java.util.*;
class Solution {
    static List<String> list = new ArrayList<>();
    public int solution(String word) {
        int answer = 0;
        String [] strArr = {"A","E","I","O","U"};
        dfs("",0,strArr);
        return list.indexOf(word)+1;
    }
    public static void dfs(String str , int len, String [] strArr){
        if(!str.isEmpty())list.add(str);
        if(len == 5) return;
        for(int i = 0; i < 5; i++){
            dfs(str + strArr[i], len +1, strArr);
        }
        
    }
}