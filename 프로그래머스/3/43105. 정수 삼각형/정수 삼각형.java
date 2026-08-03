class Solution {
    public int solution(int[][] triangle) {
      
        for(int i = triangle.length-1; i>=0; i--){
            for(int j = 1; j<triangle[i].length; j++){
                int max = Math.max(triangle[i][j],triangle[i][j-1]);
                triangle[i-1][j-1] += max;
            }
        }
        
        return triangle[0][0];
    }
}