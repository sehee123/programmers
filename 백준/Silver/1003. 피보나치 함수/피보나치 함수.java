import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        int [][] answer = new int [41][2];

       answer[0][0] = 1;
       answer[0][1] = 0;

       answer[1][0] = 0;
       answer[1][1] = 1;
        
        int start = 2;
        
        for(int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());

           if(n<start){
               sb.append(answer[n][0]).append(" ").append(answer[n][1]).append("\n");
               continue;
           }

           for(int j = start; j<=n; j++){
               answer[j][0] = answer[j-1][0] +answer[j-2][0];
               answer[j][1] = answer[j-1][1] +answer[j-2][1];
           }
           start = n+1;
           sb.append(answer[n][0]).append(" ").append(answer[n][1]).append("\n");
        }
        
         System.out.println(sb);
        
    }
    
}