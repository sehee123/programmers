class Solution {
    public int solution(int n) {
        
        int []count = {0};
        dfs(n , 0 , 0, count);
        return count[0];
    }
    
    private static void dfs(int n, int open , int close , int [] count){
        if(open == n && close == n){
            count[0] ++ ;
            return;
        }

        if(open < n ){
            dfs(n , open+1 , close , count);
        }
        
        if(close < open ){
            dfs( n, open , close +1 , count);
        }
    }
}