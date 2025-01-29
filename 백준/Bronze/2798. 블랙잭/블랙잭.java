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
        
        Arrays.sort(card);
        int maxSum = 0; 
        
        for(int i = 0; i<n-2; i++){
            
            int left = i+1,right = n-1;
            
            while(left< right){
                int sum = card[i] + card[left] + card[right]; 
                if(sum == m){
                  System.out.print(m);
                  return;
                }else if(sum < m){
                    maxSum = Math.max(maxSum,sum);
                    left ++ ; 
                }else{
                    right --;
                }
            }
        }
        System.out.print(maxSum);
    }

    
}