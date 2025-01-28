import java.io.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0; 
        for(int i = 1; i<n ; i++){
            sum +=i;
        }
        System.out.println(sum);
        System.out.print(2);
        
    }
    
}