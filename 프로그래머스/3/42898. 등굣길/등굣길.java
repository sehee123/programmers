import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int [][] map = new int [n+1][m+1];
        
        for(int [] p : puddles){
            map[p[1]][p[0]] = -1;
        }
        
        //map [i][j] = map[i-1][j] + map[i][j-1];
        int [] dx = new int []{-1,0};
        int [] dy = new int []{0,-1};
        
        map[1][1] = 1;
        
        for(int i =1; i<n+1; i++){
            for(int j =1; j<m+1; j++){
                
                if(map[i][j] == -1) continue;
                
                int count = 0; 
                for(int k = 0; k<2; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>0 && nx<n+1 && ny>0 && ny<m+1 && map[nx][ny] != -1){
                        count += map[nx][ny];
                    }   
                }
                map[i][j] += count%1000000007;
            }
        }
        
        return map[n][m];
    }
}