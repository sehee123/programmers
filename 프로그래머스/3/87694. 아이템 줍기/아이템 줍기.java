import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;

        boolean [][] visited = new boolean [102][102];
        boolean [][] board = new boolean [102][102];
        
        visited [characterX*2][characterY*2] = true;
        
        int [][] d = new int [][] {{1,-1,0,0},{0,0,1,-1}};
       
          for(int [] r  : rectangle ){  
                int minX = r[0]*2;
                int minY = r[1]*2;
                int maxX = r[2]*2;
                int maxY = r[3]*2;
              
              for(int i = minX ; i<=maxX; i++){
                  for(int j = minY; j<=maxY; j++){
                      board[i][j] = true;
                  }
              }
          }
        
        for(int [] r : rectangle){
             int minX = r[0]*2;
             int minY = r[1]*2;
             int maxX = r[2]*2;
             int maxY = r[3]*2;
            
            for(int i = minX+1 ; i<maxX; i++){
                  for(int j = minY+1; j<maxY; j++){
                      board[i][j] = false;
                  }
              }
            
        }
        
        Queue<int []> q = new LinkedList<>(); 
        q.offer(new int[]{characterX*2,characterY*2,0});
        
        while(!q.isEmpty()){
            int [] arr = q.poll();
            int x = arr[0];
            int y = arr[1];  
            int cnt = arr[2];
            
            if(x==itemX*2 && y == itemY*2) return cnt/2;
                
                for(int i = 0; i<4; i++){
                    int nx = x + d[0][i];
                    int ny = y + d[1][i]; 
                    
                    
                    if(nx < 0 || ny < 0 || nx >= 102 || ny >= 102) continue;
                    if(visited[nx][ny]) continue;
                    
                    if(board[nx][ny]){
                        q.offer(new int[]{nx,ny,cnt +1});
                        visited[nx][ny] = true;
                    }
                }
            
        }
        
        return answer;
    }
}