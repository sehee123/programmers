import java.util.*;

class Solution {
    public int solution(String arr[]) {
  
        int N = arr.length; 
        
        //연산기호, 숫자 분리 
        int num_len = N/2+1;
        int [] num = new int [num_len];
        String [] ops = new String [N/2];
        
        num[0] = Integer.valueOf(arr[0]);
        ops[0] = arr[1];
        
        for(int i =2; i<N; i++){
            if(i%2 ==0){
                //0 2 4 6
                //0 1 2 3
                num[i/2] = Integer.valueOf(arr[i]);
            }else{
                //1 3 5
                //0 1 2
                ops[i/2] = arr[i];
            }
        }
        
        int [][] max = new int [num_len][num_len];
        int [][] min = new int [num_len][num_len];
      
        for(int i =0; i<num_len; i++){
            Arrays.fill(max[i],Integer.MIN_VALUE);
            Arrays.fill(min[i],Integer.MAX_VALUE);
            
            max[i][i] = num[i];
            min[i][i] = num[i];
        }
        
        for(int len = 1; len <=num_len; len++){ //덩어리
           for(int i =0; i<num_len-len; i++){ //시작점
               int j = i+len;
               for(int k = i; k<j; k++){//어디서 쪼갤지 
                   if(ops[k].equals("+")){
                       max[i][j] = Math.max(max[i][j],max[i][k] + max[k+1][j]);
                       min[i][j] = Math.min(min[i][j],min[i][k] + min[k+1][j]);
                   }else{
                       max[i][j] = Math.max(max[i][j],max[i][k] - min[k+1][j]);
                       min[i][j] = Math.min(min[i][j],min[i][k] - max[k+1][j]);
                   }
               } 
           }
        }
        

        return max[0][num_len-1];
    }
}