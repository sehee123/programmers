class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = {0,0};
        
        int maxX = (board[0]-1)/2;
        int maxY = (board[1]-1)/2;
        
        for(String key : keyinput){
            switch(key){
                case "left" :
                    if(result[0]>-maxX){
                        result[0] --;
                    }
                    break;
                case "right":
                     if(result[0]<maxX){
                        result[0] ++;
                    }
                    break;
                case "up":
                     if(result[1]<maxY){
                        result[1] ++;
                    }
                    break;
                case "down":
                    if(result[1]>-maxY){
                        result[1] --;
                    }
                    break;
            }
        }
        
        return result;
    }
}