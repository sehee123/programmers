import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        //size
        int n = maps.length;
        int m = maps[0].length;
        
        //bfs
        Queue <int []> queue = new LinkedList<>();
        queue.offer(new int [] {0,0,1});
        
        //방문 여부
        boolean [][] visited = new boolean[n][m];
        visited [0][0] = true;
        
        //동서남북
        int [] dx = {1,-1,0,0};
        int [] dy = {0,0,-1,1};
        
        while(!queue.isEmpty()){
            int [] arr = queue.poll();
            int row = arr[0];
            int col = arr[1];
            int cnt = arr[2];
            
            if(row == n-1 && col == m-1){
                return cnt;
            }
            
            for(int i =0; i<4; i++){
                int x = row +dx[i];
                int y = col +dy[i];
                if(x>=0 && y>=0 && x<n && y<m && maps[x][y] ==1 && !visited[x][y]){
                    queue.offer(new int [] {x,y,cnt+1});
                    visited[x][y] = true;
                }
            }
        }
        
        return -1;
    }
}