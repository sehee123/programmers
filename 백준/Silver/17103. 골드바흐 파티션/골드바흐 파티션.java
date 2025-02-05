import java.util.*;
import java.io.*;

public class Main{
    
    static final int MAX = 1000000;
    static boolean [] isPrime = new boolean[MAX+1];
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        makePrime();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i< n; i++){
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int j = 2; j<=num/2; j++){
                if(isPrime[j] && isPrime[num-j]){
                   cnt ++;
                }
            }
            sb.append(cnt).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void makePrime(){
       Arrays.fill(isPrime,true);
       isPrime[0] = isPrime[1] = false;

       for(int i =2; i*i<= MAX; i++){
           if(isPrime[i]){
               for( int j = i*i ; j<=MAX; j+=i){
                   isPrime[j] = false;
               }
           }
       }
    }
    
}
