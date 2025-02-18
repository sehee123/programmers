import java.util.*;
import java.io.*;

public class Main {
    
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int [n];
        for(int i = 0; i< n; i++){
          arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        if(n%2 == 0){
            System.out.print((long)arr[0] * arr[n-1]);
        }else{
            int center = 0;
            if(n ==1){
                center = arr[0];
            }else{
                center = arr[n/2];
            }
            System.out.print((long)center*center);
        }
    }
  
}