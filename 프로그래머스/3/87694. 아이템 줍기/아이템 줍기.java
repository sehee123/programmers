import java.util.*;

class Solution {
    
    //좌표 두배
    static int MAX_VALUE = 101;
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        
        int [][] board = new int [MAX_VALUE][MAX_VALUE];
        
        //테두리 칠하기
        for(int [] r : rectangle){
            //2배 줌
            int x1 = r[0]*2;
            int x2 = r[2]*2;
            int y1 = r[1]*2;
            int y2 = r[3]*2;
            for(int i =x1; i<=x2; i++){
                for(int j =y1; j<=y2; j++){
                    if((i==x1||i== x2||j==y1||j==y2) && board[i][j]!=2){
                        board[i][j] = 1;
                    }else{
                        board[i][j] = 2;
                    } 
                }
            }
        }
        
        for(int i =0; i<board.length; i++){
            for(int j =0; j<board[i].length; j++){
                 //System.out.println(i + " , " + j + " : " +board[i][j]);
            }
        }
        
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[]{characterX*2,characterY*2,0});
        boolean [][] visited = new boolean [MAX_VALUE][MAX_VALUE];
        while(!q.isEmpty()){
            int [] current = q.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];
           
            visited[x][y] = true;
            if(x ==itemX*2 && y == itemY*2) return count/2;
            
            //상하좌우
            int[] dx = new int []{1,-1,0,0};
            int[] dy = new int []{0,0,1,-1};
            
            for(int i =0; i<4; i++){
                
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && ny>=0 && nx<MAX_VALUE && ny<MAX_VALUE && board[nx][ny] == 1 && !visited[nx][ny]){
                    q.offer(new int []{nx,ny,count+1});
                }
            }
            
        }
        
        return answer;
    }
}