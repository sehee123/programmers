class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int [][] cost = new int [m][n];
        boolean [][] isPuddles = new boolean [m][n];
        cost[0][0] = 1;
        
        for(int [] puddle : puddles){
            isPuddles[puddle[0]-1][puddle[1]-1] = true;
            //웅덩이 표시
        }
        
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(i == 0 && j==0) continue;
                if(isPuddles[i][j]) continue;
                
                if(i == 0){
                    cost[i][j] = cost[i][j-1];
                }else if(j == 0){
                    cost[i][j] = cost[i-1][j];
                }else {
                     cost[i][j] = (cost[i-1][j] + cost[i][j-1])%1000000007;
                }
            }
        }
        
        return cost[m-1][n-1];
    }
}