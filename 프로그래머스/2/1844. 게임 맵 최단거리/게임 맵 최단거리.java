import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        
        int n = maps.length;
        int m = maps[0].length;
        
        Queue <int []> q = new LinkedList<>();
        q.offer(new int []{0,0});
        
        
        int [] dx = {1,-1,0,0};
        int [] dy = {0,0,1,-1};
        
        while(!q.isEmpty()){
           int [] array =  q.poll();
            int x = array[0];
            int y = array[1];
            
            if(x == n-1 && y == m-1) return maps[n-1][m-1];
            
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx == n || ny == m || nx < 0 || ny < 0)continue;
                
                if(maps[nx][ny] == 1){
                    maps[nx][ny] = maps[x][y]+1;
                    q.offer(new int []{nx,ny});
                }
            }
        }
        
        return answer;
    }
}