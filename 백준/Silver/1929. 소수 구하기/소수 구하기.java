import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] arr = br.readLine().split(" ");
        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);
        
        for(int i = start; i<=end; i++){
            if(isPrime(i))sb.append(i).append("\n");
        }
        System.out.print(sb);
        
    }
    
    private static boolean isPrime(int num){
        if(num < 2) return false; 
        if(num ==2) return true;
        if(num%2 == 0) return false;
        for(int i = 3; i<=Math.sqrt(num); i++){
            if(num%i==0)return false;
        }
        return true;
    }
    
}