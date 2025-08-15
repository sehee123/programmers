import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        // {{}} 삭제
        s = s.substring(2, s.length()-2);
        
        //},{ 삭제
        String [] parts = s.split("\\},\\{");
        
        //정렬 
        Arrays.sort(parts, (a,b) -> a.length() - b.length());
        
        Set<Integer> duplCheck = new HashSet<>();
        List<Integer> answer = new ArrayList<>();
        
        for(String part : parts){
            for(String numStr: part.split(",")){
                int num = Integer.parseInt(numStr);
                if(duplCheck.add(num)){
                    answer.add(num);
                }
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}