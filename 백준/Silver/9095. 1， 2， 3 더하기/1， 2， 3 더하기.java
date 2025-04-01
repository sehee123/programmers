import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            if(n<3){
                System.out.println(n);
                continue;
            }else if(n==3){
                 System.out.println(4);
                continue;
            }
            
            int [] nums = new int [n+1];
            nums[1] = 1;
            nums[2] = 2;
            nums[3] = 4;
            
            for(int j = 4; j<nums.length; j++){
                nums[j] = nums[j-1] + nums[j-2] + nums[j-3];
            }
            System.out.println(nums[n]);
        }
        
    }
    
}