import java.io.*;
import java.util.*;

public class Main{
    
     public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] arr  = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int [] cnt  = new int[n+1];
        Arrays.fill(cnt, 0);

        for(int i = 0; i < m ; i++){
            String [] nums  = br.readLine().split(" ");
            int start = Integer.parseInt(nums[0]);
            int end = Integer.parseInt(nums[1]);
            int ball = Integer.parseInt(nums[2]);


            for(int j = start ; j<=end ; j++ ){
                cnt[j] = ball;
            }
        }
        for(int i = 1; i<cnt.length; i++){

            System.out.print(cnt[i]);
            if(i<cnt.length-1) System.out.print(" ");
        }
    }
    
}