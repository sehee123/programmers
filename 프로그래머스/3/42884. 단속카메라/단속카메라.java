import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        Arrays.sort(routes, (a,b) -> a[1]- b[1]);
        
        int current = routes[0][1];
        answer ++;
        for(int[] route : routes){
            
            if(route[0] > current){
                current = route[1];
                answer ++;
            }
        }
        
        
        return answer;
    }
}