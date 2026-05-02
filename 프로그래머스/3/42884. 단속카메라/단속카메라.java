import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        //[-20,-15] [-18,-13] [-14,-5] [-5,-3]
        
        //진출점 기준으로 오름차순 정렬 
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1],b[1]));

        int camera = routes[0][1];
        answer ++;
                
        for(int i =1 ; i<routes.length; i++){
            int [] route = routes[i];
            
            //카메라랑 범위 안겹침
            if(camera < route[0]){
                answer ++;
                camera = route[1];
            }
            
        }
        
        return answer;
    }
}