import java.util.*;

class Solution {
    public int solution(int[] arrows) {
        int answer = 0;
        
        //좌표 
        int [] dx = {0,1,1,1,0,-1,-1,-1};
        int [] dy = {1,1,0,-1,-1,-1,0,1};
        
        int currentX = 0; 
        int currentY = 0;
        
        Set<String> pointSet = new HashSet<>();
        Set<String> lineSet = new HashSet<>();
        pointSet.add(currentX + ":" + currentY);
        
        for(int arrow : arrows){
           for(int i =0; i<2; i++){
            
                int nextX = currentX + dx[arrow];
                int nextY = currentY + dy[arrow];

                String next = nextX + ":" + nextY;

                String line = "";
                if(currentX<nextX || (currentX == nextX) && currentY < nextY){
                    line = currentX + ":" + currentY + ":" + nextX + ":"+nextY;
                }else {
                    line = nextX + ":" + nextY + ":" + currentX + ":"+currentY;
                }
                currentX = nextX;
                currentY = nextY;
                
               //중복 좌표 && 중복아닌 선 => 도형 
                if(lineSet.add(line) && !pointSet.add(next)){
                    answer ++;
                }
            
            }
        }
        
        return answer;
    }
}