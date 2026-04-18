class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int [][] compares = new int [sizes.length][2];
        
        for(int i =0; i<sizes.length; i++){
            int w = sizes[i][0];
            int h = sizes[i][1];
            compares[i][0] = Math.max(w,h);
            compares[i][1] = Math.min(w,h);
        }
        
        int w_max = 0;
        int h_max = 0;
        
        for(int [] compare : compares){
            w_max = Math.max(compare[0],w_max);
            h_max = Math.max(compare[1],h_max);
        }
        
        return w_max * h_max;
    }
}