import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String []args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split(" ");
       int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int [] card = new int [n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ; i++){
           card [i] = Integer.parseInt(st.nextToken());
        }
        int gap = Integer.MAX_VALUE;
        for(int i = 0; i< n ; i++){
            for(int j = 0; j < i; j++){
                for(int k = 0; k < j; k++){
                    int sum =  card[i] + card[j] + card[k];
                    if(sum <= m && gap > (m - sum) ){
                        gap = m - sum;
                    }
                }
            }
        }
        System.out.print(m - gap);
    }

    
}