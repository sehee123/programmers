import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] arr = br.readLine().split(" ");

        int [] a = {Integer.parseInt(arr[0]),Integer.parseInt(arr[1])};
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if(a[1] <= n*(c - a[0]) && (c-a[0]) >= 0){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

        
    }
    
}