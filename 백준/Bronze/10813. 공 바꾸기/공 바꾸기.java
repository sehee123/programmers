import java.io.*;
import java.util.*;

public class Main {

    public static void main(String [] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String [] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        
        int [] ball = new int [n+1];
        
        for(int i = 0; i<ball.length; i++){
            ball[i] = i;
        }
        
        for(int i = 0; i< m ; i++){
            String [] basket = br.readLine().split(" ");
            int a = Integer.parseInt(basket[0]);
            int b = Integer.parseInt(basket[1]);
            
            int tmpA = ball[a];
            ball[a] = ball[b];
            ball[b] = tmpA;  
        }
        
         for(int i = 1; i<ball.length; i++){
            System.out.print(ball[i]);
            if(i!=ball.length-1)System.out.print(" ");
        }
       
    
    }

}