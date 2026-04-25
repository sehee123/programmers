import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        
        // ㄷ 자에서 아래에서 위로 바로 점프하는 함정때문에 2배를 해준다. 
        boolean [][] visited = new boolean [102][102];
        boolean [][] maps = new boolean [102][102];
        
        visited[characterX*2][characterY*2] = true; 
   
        //1. true 로 테두리 채우기 
        for(int [] r : rectangle){
            int minX = r[0]*2;
            int minY = r[1]*2; 
            
            int maxX = r[2]*2;
            int maxY = r[3]*2;
            
            for(int i = minX ; i<=maxX ; i++){
                for(int j= minY; j<=maxY; j++){
                    maps[i][j] = true;
                }
            }
        }
        
        //2. false 로 내부는 지우기 
        for(int [] r: rectangle){
            int minX = r[0]*2;
            int minY = r[1]*2; 
            
            int maxX = r[2]*2;
            int maxY = r[3]*2;
            
            for(int i = minX+1; i<maxX ; i++){
                for(int j =minY+1; j<maxY; j++){
                    maps[i][j] = false;
                }
            }
        }
        
        //3. bfs 
        Queue<int []> q = new LinkedList<>(); 
        q.offer(new int []{characterX*2, characterY*2,0});
        
        int [] dx = {1,-1,0,0};
        int [] dy = {0,0,1,-1};
        
        while(!q.isEmpty()){
            int [] current = q.poll();
            int x = current[0];
            int y = current[1];
            int d = current[2];
            
            //System.out.println(answer);
            if(x==itemX*2 && y==itemY*2) return d/2;
            
            for(int i =0; i<4; i++){
                int nextX = x +dx[i];
                int nextY = y + dy[i];
                
                if(nextX<0 || nextX>101 || nextY<0 || nextY >101 )continue;
                
                if(!visited[nextX][nextY]&&maps[nextX][nextY]){
                    visited[nextX][nextY] = true;
                    q.offer(new int[]{nextX, nextY, d+1});
                }
            }
        }
        
        return answer;
    }
}