import java.io.*;
import java.util.*;

public class Main {
    
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        int gap = 0;
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(i>0){
                gap = gcd(arr[i]- arr[i-1],gap);
            }
        }
        int cnt = 0;
        for(int i = 0; i<n-1; i++){
            int cur = arr[i] + gap;
            while(arr[i+1] != cur){
                cur += gap;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static int gcd(int a , int b){
        while(b>0){
            int tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
    
}