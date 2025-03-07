class Solution {
    
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        
        boolean [] visited = new boolean[dungeons.length];

        dfs(dungeons,k, visited, 0);

        
        return answer;
    }
    
    public static void dfs(int [][] dungeons, int k  , boolean [] visited, int depth ){
        answer = Math.max(answer , depth);
        for(int i = 0; i< dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <=k){
                visited[i]= true;
                dfs(dungeons, k-dungeons[i][1] , visited, depth+1);
                visited[i] = false;
            }
        }
    }
}