import java.io.*;

public class Main {
    public static void main(String [] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder ();

       int n = Integer.parseInt(br.readLine());

       for(int i = 0; i< n; i++){
           String [] arr = br.readLine().split(" ");
           int a = Integer.parseInt(arr[0]);
           int b = Integer.parseInt(arr[1]);
           
           sb.append((a*b)/(gcd(a,b))).append("\n");
       }

        System.out.println(sb);
    }
    
    private static int gcd(int a , int b){
        while(b > 0){
        	int tmp = b;
            b = a% b;
            a = tmp;
        }
        return a; 
    }
    
}