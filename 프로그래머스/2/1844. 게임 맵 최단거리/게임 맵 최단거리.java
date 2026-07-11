import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        int n = maps.length;
        int m = maps[0].length;
        boolean [][]visited = new boolean [n][m];
        
        Queue<int []> q = new LinkedList<>();
        q.offer(new int []{0,0,1});
        
        while(!q.isEmpty()){
            int [] current = q.poll();
            int x = current[0];
            int y = current[1];
            int cnt = current[2];
            
            if(x==n-1 && y ==m-1){
                return cnt;
            }
            
            int [] dx = new int []{1,-1,0,0};
            int [] dy = new int []{0,0,1,-1};
            
            for(int i =0; i<4; i++){
                int moveX = x + dx[i];
                int moveY = y + dy[i];
                
                if(moveX < 0 || moveY<0 || moveX >=n || moveY >=m){
                    continue;
                }
                
                if(maps[moveX][moveY] == 1 && !visited[moveX][moveY]){
                    visited[moveX][moveY] = true;
                    q.offer(new int []{moveX,moveY,cnt+1});
                }
            }
        }
        
        return -1;
    }
}