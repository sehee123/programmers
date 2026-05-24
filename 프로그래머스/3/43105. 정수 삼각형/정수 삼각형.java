class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        for(int i = 1; i<triangle.length; i++){
            for(int j =0; j<triangle[i].length; j++){
                int num = 0;
                if(j ==0){
                    num = triangle[i-1][j];
                }else if(j== triangle[i].length-1){
                    num = triangle[i-1][j-1];
                }else {
                    num = Math.max(triangle[i-1][j-1],triangle[i-1][j]);
                }
                triangle[i][j] += num;
            }
        }
        
        for(int num : triangle[triangle.length-1]){
            answer = Math.max(answer, num);
            
        }
        
        return answer;
    }
}