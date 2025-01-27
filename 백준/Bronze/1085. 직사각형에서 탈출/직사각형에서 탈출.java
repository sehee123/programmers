import java.io.*;

public class Main{
    
    public static void main(String[] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String [] arr = br.readLine().split(" ");
        int minVal = Integer.MAX_VALUE;
        
        for(int i = 0; i<2; i++){
            int val = Integer.parseInt(arr[i+2])-Integer.parseInt(arr[i]);
            if(minVal > val){
                minVal = val;
            }
            int x =  Integer.parseInt(arr[i]);
            if(minVal > x){
                minVal =x ;
            }        
        }
        
        System.out.print(minVal);
        
    }
    
}