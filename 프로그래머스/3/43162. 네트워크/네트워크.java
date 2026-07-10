class Solution {
    
    boolean [] visited ;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean [n];
       
        for(int i =0; i<n; i++){
            if(!visited[i]){
                answer ++;
                dfs(i, computers, n);
            }
        }
        
        return answer;
    }
    
    public void dfs(int idx, int [][] computers, int n ){
        int[] arr = computers[idx];
        for(int i =0; i<n; i++){
            if(!visited[i] && arr[i]==1){
                visited[i] = true;
                dfs(i,computers,n);
            }
        }
    }
}