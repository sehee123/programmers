import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        int n = maps.length;
        int m = maps[0].length;
        
        boolean [][] visited = new boolean [n][m];
        int [][] distance = new int [n][m];
        
        Queue<int []> q = new LinkedList<>();
        int [] start = {0,0};
        q.offer(start);
        distance [0][0] = 1;
        
        while(!q.isEmpty()){
            
            int [] current = q.poll();
            int x = current[0]; 
            int y = current[1];
            
            //visited[x][y] = true;
            //System.out.println(x + " : " + y);
            if(x == n-1 && y == m-1) return distance[x][y];
            //상하좌우
            int [] dx = {1,-1,0,0};
            int [] dy = {0,0,1,-1};
            
            for(int i =0; i<4; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                
                if(nextX>-1 && nextX<n && nextY>-1 && nextY<m && !visited[nextX][nextY]){
                    if(maps[nextX][nextY] == 1){
                        int [] next = {nextX,nextY};
                        distance [nextX][nextY] = distance[x][y] + 1;
                        q.offer(next);
                        visited[nextX][nextY]= true;
                    }
                }
                
            }
            
            
            
        }
        
        return -1;
    }
}