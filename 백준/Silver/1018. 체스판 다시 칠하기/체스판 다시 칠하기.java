import java.io.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String [] arr = br.readLine().split(" ");
       int n = Integer.parseInt(arr[0]);
       int m = Integer.parseInt(arr[1]);
       boolean [][] board = new boolean[n][m];

        for(int i = 0; i< n; i++){
            String str = br.readLine();
            for(int j = 0; j< m ; j++){
                if(str.charAt(j) == 'W'){
                    board[i][j] = true;
                }else{
                    board[i][j] = false;
                }

            }
        }
        br.close();
        int minCnt = 25*25;
       for(int i = 0; i<=n-8; i++){
           for(int j = 0; j<=m-8; j++){
               int cnt =  Math.min(getCount(i , j, board, true),getCount(i , j, board, false)) ;
               if(cnt == 0){
                    minCnt = 0;
                    break;
               }
               minCnt = Math.min(minCnt, cnt);
           }
       }
       System.out.println(minCnt);
    }


    private static int getCount(int x , int y , boolean [][] board, boolean val){
        int cnt = 0;
        for(int i = x; i<x+8; i++){
            val = !val;
            for(int j = y; j < y+8; j++){
                if(val == board[i][j]){
                    val = !board[i][j];
                    cnt ++;
                }else{
                    val = board[i][j];
                }
            }
        }
        return cnt;
    }

}