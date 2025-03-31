import java.util.*;
import java.io.*;

public class Main {
    
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        int [] arr = new int [num+1];
        
        
        if(num>1){
            arr[2] = 1;
        }
        if(num>2){
            arr[3] = 1;
        }
       

        for(int i=4; i<=num; i++){

            int cnt3 = Integer.MAX_VALUE;
            int cnt2 = Integer.MAX_VALUE;
            int cnt1 = Integer.MAX_VALUE;

            if(i %3 ==0){
                cnt3 = arr[i/3];
            }
            if(i %2 ==0){
                cnt2 = arr[i/2];
            }
            
            cnt1 = arr[i-1];
            

            int min = Math.min(cnt3,Math.min(cnt2,cnt1));
           
            arr[i] = min +1;
        }
        System.out.println(arr[num]);
    }
    
}