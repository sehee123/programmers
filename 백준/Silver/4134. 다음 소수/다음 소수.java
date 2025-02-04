import java.io.*;
import java.util.*;

public class Main {
    
        public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        for(int i =0; i<n; i++){
            long num = Long.parseLong(br.readLine());
            while(true){
                if(isPrime(num)){
                    sb.append(num).append("\n");
                    break;
                }else{
                    num++;
                }
            }
        }
        System.out.print(sb);
    }
    private static boolean isPrime(long num){
        if(num <2) return false;
        if(num ==2) return true;
        if(num %2==0) return false;

        for(long i =3; i<=Math.sqrt(num); i+=2){
            if(num%i == 0)return false;
        }
        return true;
    }
    
}