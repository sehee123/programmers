import java.util.*;
import java.io.*;

public class Main {
    static int [][]dp = new int [30][30];
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            String [] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            long answer = combination(m,n);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
    private static int combination(int m, int n){
       if(dp[m][n] > 0) return dp[m][n];
       if(n == 0 || m == n) return dp[m][n] = 1;
       return dp[m][n] = combination(m-1,n-1) + combination(m-1,n);

    }
    
}