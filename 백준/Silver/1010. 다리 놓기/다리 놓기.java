import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
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
    private static long combination (int m, int n){
        //m개에서 n개를 선택할 수 있는 경우의 수
        long answer = 1;
        for(int i = 0 ; i< n; i++){
            answer *=(m-i);
            answer /=(i+1);
        }
        return answer;
    }
    
}