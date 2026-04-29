import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        
        //생각 뒤집기 x이상 거리를 구하려면 몇개(n)를 빼야하는가?
        Arrays.sort(rocks);
        //(0) 2 11 14 17 21 (25)
        
        int left = 0;
        int right = distance;
        
        while(left<=right){
            int mid = (right+left)/2; //최소거리 
            int current = 0; 
            int removeRocks = 0;
            
            for(int r: rocks){
                int gap = r- current; 
                if(gap<mid){ //최소값 보다 작으면 바위를 제거해서 간격을 늘리기 
                    removeRocks++;
                }else{//그게 아니면 통과
                    current = r; 
                }
                if(removeRocks>n)break;
            }
            
            if(distance - current < mid) removeRocks++;
            
            if(removeRocks>n){
                right = mid -1;
            }else{
                answer = mid;
                left = mid +1;
            }
        }
    
        return answer;
    }
}