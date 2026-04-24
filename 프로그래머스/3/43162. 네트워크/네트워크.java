class Solution {
    boolean [] visited ;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean [n];
        
        for(int i = 0; i<computers.length; i++){
            if(!visited[i]){
                answer ++;
                dfs(computers,i,n);
            }
        }
        
        return answer;
    }
    public void dfs(int [][] computers,int i, int n ){
        visited[i] = true;
       
        for(int j = 0; j<n; j++){
            if(!visited[j] && computers[i][j]==1){
                dfs(computers,j,n);
            }
        }
    }
}